package com.system.mapper;

import com.system.po.Student;
import com.system.po.StudentExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @Author:Wangzehui
 * @Date:Created in 12:32 2019/3/18
 * @Description:
 */
public interface StudentMapper {
    int countByExample(StudentExample example);

    int deleteByExample(StudentExample example);

    int deleteByPrimaryKey(Integer userid);

    int insert(Student record);

    int insertSelective(Student record);

    List<Student> selectByExample(StudentExample example);

    Student selectByPrimaryKey(Integer userid);

    int updateByExampleSelective(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByExample(@Param("record") Student record, @Param("example") StudentExample example);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);
}