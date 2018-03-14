package com.gk.entity;

/**
 * @Author:
 * @Version: V 1.0
 * @Description: 用户表的扩展类
 * @author: Lime
 * @date: 2018/3/8
 **/
public class SysUserCustom extends SysUser{

    /**
     * 添加用户信息的扩展属性
     */
    private Long roleId;

//    public SysUserCustom(Long id, String account, String password, String email, Date updateTime) {
//        super(id, account, password, email, updateTime);
//    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }
}
