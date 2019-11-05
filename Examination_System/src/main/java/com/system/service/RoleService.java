package com.system.service;

import com.system.po.Role;
/**
 * Role 权限表Service层
 * @Author:Wangzehui
 * @Description:
 */
public interface RoleService {

    Role findByid(Integer id) throws Exception;

}
