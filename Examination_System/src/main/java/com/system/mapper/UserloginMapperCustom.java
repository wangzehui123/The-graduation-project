package com.system.mapper;

import com.system.po.UserloginCustom;

/**
 * @Author:Wangzehui
 * @Date:Created in 11:43 2019/3/13
 * @Description:
 */
public interface UserloginMapperCustom {

    UserloginCustom findOneByName(String name) throws Exception;

}
