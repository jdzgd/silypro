package com.gk.service;


import com.gk.entity.SysUser;
import com.gk.entity.SysUserCustom;

import java.util.List;

/**
 * @Author:
 * @Version: V 1.0
 * @Description:
 * @Date: Created in 9:49 2018/1/4
 * @Modified By:
 **/
public interface SysUserLoginService {

    /**
     * 用户登录
     */
    SysUser checkLogin(SysUser sysUser)throws Exception;

    /**
     * 用户注册
     */
    Integer registerSysUser(SysUser sysUser) throws Exception;

    /**
     * 查询所有用户
     */
    List<SysUser> selectSysUser();

    /**
     * 查询所有用户并分页的数据集合
     */
    List<SysUser> selectSysUserLimit(int pageNum, int pageSize);

    /**
     * 新增用户
     */
    Integer insertSysUser(SysUser sysUser)throws Exception;

    /**
     * 根据id查询用户
     */
    SysUser selectSysUserById(SysUser sysUser)throws Exception;

    /**
     * 根据id删除用户
     */
    void deleteSysUserById(SysUser sysUser)throws Exception;

    /**
     * 根据id更新用户
     */
//    Integer updateSysUserById(SysUserCustom sysUserCustom);
}
