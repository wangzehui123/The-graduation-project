package com.system.mapper;



import com.system.po.College;
import com.system.po.CollegeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @Author:Wangzehui
 * @Date:Created in 11:46 2019/3/20
 * @Description:
 */
public interface CollegeMapper {
    int countByExample(CollegeExample example);

    int deleteByExample(CollegeExample example);

    int deleteByPrimaryKey(Integer collegeid);

    int insert(College record);

    int insertSelective(College record);

    List<College> selectByExample(CollegeExample example);

    College selectByPrimaryKey(Integer collegeid);

    int updateByExampleSelective(@Param("record") College record, @Param("example") CollegeExample example);

    int updateByExample(@Param("record") College record, @Param("example") CollegeExample example);

    int updateByPrimaryKeySelective(College record);

    int updateByPrimaryKey(College record);
}