package com.system.mapper;

import com.system.po.Selectedcourse;
import com.system.po.SelectedcourseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @Author:Wangzehui
 * @Date:Created in 15:32 2019/3/19
 * @Description:
 */
public interface SelectedcourseMapper {
    int countByExample(SelectedcourseExample example);

    int deleteByExample(SelectedcourseExample example);

    int insert(Selectedcourse record);

    int insertSelective(Selectedcourse record);

    List<Selectedcourse> selectByExample(SelectedcourseExample example);

    int updateByExampleSelective(@Param("record") Selectedcourse record, @Param("example") SelectedcourseExample example);

    int updateByExample(@Param("record") Selectedcourse record, @Param("example") SelectedcourseExample example);
}