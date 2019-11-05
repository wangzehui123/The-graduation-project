package com.system.mapper;

import com.system.po.Course;
import com.system.po.CourseCustom;
import com.system.po.CourseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @Author:Wangzehui
 * @Date:Created in 10:10 2019/2/27
 * @Description:
 */
public interface CourseMapper {
    int countByExample(CourseExample example);

    int deleteByExample(CourseExample example);

    int deleteByPrimaryKey(Integer courseid);

    int insert(Course record);

    int insertSelective(Course record);

    List<Course> selectByExample(CourseExample example);

    Course selectByPrimaryKey(Integer courseid);

    Course selectCourse(CourseCustom courseCustom);

    Course selectCourseTeacher(CourseCustom courseCustom);

    int updateByExampleSelective(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByExample(@Param("record") Course record, @Param("example") CourseExample example);

    int updateByPrimaryKeySelective(Course record);

    int updateByPrimaryKey(Course record);
}