package com.system.controller;

import com.system.exception.CustomException;
import com.system.po.*;
import com.system.service.CollegeService;
import com.system.service.CourseService;
import com.system.service.SelectedCourseService;
import com.system.service.StudentService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 *
 *
 */
@Controller
@RequestMapping(value = "/student")
public class StudentController {

    @Resource(name = "courseServiceImpl")
    private CourseService courseService;

    @Resource(name = "studentServiceImpl")
    private StudentService studentService;

    @Resource(name = "selectedCourseServiceImpl")
    private SelectedCourseService selectedCourseService;

    @Resource(name = "collegeServiceImpl")
    private CollegeService collegeService;
    
    //搜索课程
    @RequestMapping(value = "/selectCourse", method = {RequestMethod.POST})
    private String selectCourse(String findByName, Model model) throws Exception {

        List<CourseCustom> list = courseService.findByName(findByName);

        model.addAttribute("courseList", list);
        return "student/showCourse";
    }

    @RequestMapping(value = "/showCourse")
    public String stuCourseShow(Model model, Integer page) throws Exception {

        List<CourseCustom> list = null;
        //页码对象
        PagingVO pagingVO = new PagingVO();
        //设置总页数
        pagingVO.setTotalCount(courseService.getCountCouse());
        if (page == null || page == 0) {
            pagingVO.setToPageNo(1);
            list = courseService.findByPaging(1);
        } else {
            pagingVO.setToPageNo(page);
            list = courseService.findByPaging(page);
        }

        model.addAttribute("courseList", list);
        model.addAttribute("pagingVO", pagingVO);

        return "student/showCourse";
    }

    // 选课操作
    @RequestMapping(value = "/stuSelectedCourse")
    public String stuSelectedCourse(int id) throws Exception {
    	System.out.println(id);
        //获取当前用户名
        Subject subject = SecurityUtils.getSubject();
        String username = (String) subject.getPrincipal();

        SelectedCourseCustom selectedCourseCustom = new SelectedCourseCustom();
        selectedCourseCustom.setCourseid(id);
        selectedCourseCustom.setStudentid(Integer.parseInt(username));

        SelectedCourseCustom s = selectedCourseService.findOne(selectedCourseCustom);
        if (s == null) {
            selectedCourseService.save(selectedCourseCustom);
        } else {
            throw new CustomException("该门课程你已经选了，不能再选");
        }

        return "redirect:/student/selectedCourse";
    }

    // 退课操作
    @RequestMapping(value = "/outCourse")
    public String outCourse(int id) throws Exception {
        Subject subject = SecurityUtils.getSubject();
        String username = (String) subject.getPrincipal();

        SelectedCourseCustom selectedCourseCustom = new SelectedCourseCustom();
        selectedCourseCustom.setCourseid(id);
        selectedCourseCustom.setStudentid(Integer.parseInt(username));

        selectedCourseService.remove(selectedCourseCustom);

        return "redirect:/student/selectedCourse";
    }

    // 已选课程
    @RequestMapping(value = "/selectedCourse")
    public String selectedCourse(Model model) throws Exception {
        //获取当前用户名
        Subject subject = SecurityUtils.getSubject();
        StudentCustom studentCustom = studentService.findStudentAndSelectCourseListByName((String) subject.getPrincipal());

        List<SelectedCourseCustom> list = studentCustom.getSelectedCourseList();

        model.addAttribute("selectedCourseList", list);

        return "student/selectCourse";
    }

    // 已修课程
    @RequestMapping(value = "/overCourse")
    public String overCourse(Model model) throws Exception {

        //获取当前用户名
        Subject subject = SecurityUtils.getSubject();
        StudentCustom studentCustom = studentService.findStudentAndSelectCourseListByName((String) subject.getPrincipal());

        List<SelectedCourseCustom> list = studentCustom.getSelectedCourseList();

        model.addAttribute("selectedCourseList", list);

        return "student/overCourse";
    }

    //修改密码
    @RequestMapping(value = "/passwordRest")
    public String passwordRest() throws Exception {
        return "student/passwordRest";
    }

    //修改个人信息页面跳转
    @RequestMapping(value = "editInformation", method = {RequestMethod.GET})
    public String getEditInformationURL(Model model) throws Exception{
        //获取当前用户名
        Subject subject = SecurityUtils.getSubject();
        Integer id = Integer.valueOf(subject.getPrincipal().toString());
        if (id == null) {
            //加入没有带学生id就进来的话就返回学生显示页面
            return "redirect:/admin/showStudent";
        }
        StudentCustom studentCustom = studentService.findById(id);
        if (studentCustom == null) {
            throw new CustomException("未找到该名学生");
        }
        List<College> list = collegeService.finAll();

        model.addAttribute("collegeList", list);
        model.addAttribute("student", studentCustom);

        return "student/information";
    }

    //修改个人信息处理
    @RequestMapping(value = "/editInformation", method = {RequestMethod.POST})
    @ResponseBody
    public String editInformation(StudentCustom studentCustom) throws Exception {

        studentService.updataById(studentCustom.getUserid(), studentCustom);

        //重定向
        return "修改成功";
    }
}
