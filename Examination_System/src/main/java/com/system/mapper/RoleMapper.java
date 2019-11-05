package com.system.mapper;

import com.system.po.Role;
import com.system.po.RoleExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @Author:Wangzehui
 * @Date:Created in 12:56 2019/3/18
 * @Description:
 */
public interface RoleMapper {
    int countByExample(RoleExample example);

    int deleteByExample(RoleExample example);

    int deleteByPrimaryKey(Integer roleid);

    int insert(Role record);

    int insertSelective(Role record);

    List<Role> selectByExample(RoleExample example);

    Role selectByPrimaryKey(Integer roleid);

    int updateByExampleSelective(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByExample(@Param("record") Role record, @Param("example") RoleExample example);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}