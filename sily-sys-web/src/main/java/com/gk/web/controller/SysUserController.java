package com.gk.web.controller;

import com.gk.entity.SysUser;
import com.gk.entity.SysUserCustom;
import com.gk.service.SysUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author:
 * @Version: V 1.0
 * @Description:
 * @Date: Created in 10:03 2018/1/4
 * @Modified By:
 **/
@Controller
@RequestMapping("/user")
@SessionAttributes("sysUser")
public class SysUserController {

    @Autowired
    private SysUserLoginService sysUserLoginService;

    /**
     * 用户登录
     */
    @GetMapping(value = "/test")
    @ResponseBody
    public String checkLogin() throws Exception {
        return "hello";
    }
    /**
     * 用户登录
     */
    @PostMapping(value = "/login")
    @ResponseBody
    public SysUser checkLogin(@RequestBody SysUser sysUser) throws Exception {
        return sysUserLoginService.checkLogin(sysUser);
    }

    /**
     * 用户注册
     */
    @PostMapping(value = "/register")
    @ResponseBody
    public String userRegister(@RequestBody SysUser sysUser) throws Exception{
            return String.valueOf(sysUserLoginService.registerSysUser(sysUser));
    }

    /**
     * 查询所有用户
     */
    @PostMapping(value = "/alluser")
    @ResponseBody
    public List<SysUser> selectSysUser() {
        return sysUserLoginService.selectSysUser();
    }

    /**
     * 查询所有用户并分页
     */
    @PostMapping(value = "/alluserlist")
    @ResponseBody
    public List<SysUser> selectSysUser(@RequestBody int pageNum,int pageSize) {
        return sysUserLoginService.selectSysUserLimit(pageNum,pageSize);
    }

    /**
     * 根据id查询用户
     */
    @PostMapping(value = "/singleuser")
    @ResponseBody
    public SysUser selectSysUserById(@RequestBody SysUser sysUser) throws Exception {
        return sysUserLoginService.selectSysUserById(sysUser);
    }

    /**
     * 根据id更新用户
     */
//    @RequestMapping(value = "/updateSingleuser", method = RequestMethod.POST)
//    @ResponseBody
//    public Integer updateSysUserById(@RequestBody SysUserCustom sysUserCustom){
//        return sysUserLoginService.updateSysUserById(sysUserCustom);
//    }
}
