package com.gk.service.impl;


import com.gk.entity.SysUser;
import com.gk.repository.SysLoginDao;
import com.gk.repository.SysUserDao;
import com.gk.service.SysUserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author:
 * @Version: V 1.0
 * @Description:
 * @Date: Created in 9:50 2018/1/4
 * @Modified By:
 **/
@Service
public class SysUserLoginServiceImpl implements SysUserLoginService {

    @Resource
    private SysLoginDao sysLoginDao;
    @Autowired
    private SysUserDao sysUserDao;
//    @Autowired
//    private SysUserRoleDao sysUserRoleDao;

    /**
     * 用户登录
     */
    @Override
    public SysUser checkLogin(SysUser sysUser) throws Exception {
        SysUser sysLoginUser = sysLoginDao.selectByLoginName(sysUser.getAccount());
        if (sysLoginUser != null && sysLoginUser.getPassword().equals(sysUser.getPassword())){
            return sysLoginUser;
        }
        return null;
    }

    /**
     * 用户注册
     */
    @Override
    public Integer registerSysUser(SysUser sysUser)throws Exception {
        Integer integer = sysLoginDao.insertLoginSysUser(sysUser);
        if (integer.equals(1)){
            return integer;
        }
        return 0;
    }

    /**
     * 查询所有用户
     */
    @Override
    public List<SysUser> selectSysUser() {
        List<SysUser> userList = sysUserDao.selectSysUser();
        return userList;
    }

    /**
     * 查询所有用户并分页的数据集合
     */
    @Override
    public List<SysUser> selectSysUserLimit(int pageNum,int pageSize){
        return sysUserDao.selectSysUserLimit(pageNum,pageSize);
    }

    /**
     * 新增用户
     */
    @Override
    public Integer insertSysUser(SysUser sysUser) throws Exception {
        return null;
    }

    /**
     * 根据id查询用户
     */
    @Override
    public SysUser selectSysUserById(SysUser sysUser) throws Exception {
        return sysUserDao.selectSysUserById(sysUser.getId());
    }

    /**
     * 根据id删除用户
     */
    @Override
    public void deleteSysUserById(SysUser sysUser) throws Exception {
        sysUserDao.deleteSysUserById(sysUser.getId());
    }



    /**
     * 根据id更新用户
     */
//    @Override
//    public Integer updateSysUserById(SysUserCustom sysUserCustom){
//        Integer integer =sysUserDao.updateSysUserById(sysUserCustom);
//
//        SysUserRole sysUserRole = sysUserRoleDao.selectSysUserRoleByUserId(sysUserCustom.getId());
//        //判断Sys_User_Role表是否存在用户对应的角色，并且对应的角色roleId是否和现在选择的角色是否相同，如果不存在就添加到Sys_User_Role表，如果存在更新(无论是否用户角色对应是否相同)
//        if(sysUserRole!=null && !sysUserRole.getRoleId().equals(sysUserCustom.getRoleId())){
//            sysUserRoleDao.updateSysUserRoleByUserId(sysUserCustom.getRoleId(),sysUserCustom.getEnable(),sysUserRole.getId());
//        }else {
//            /*sysUserRoleDao.insertSysUserRoleByUserSelectRole(1,sysUserCustom.getId(),sysUserCustom.getRoleId(),sysUserCustom.getEnable(),1);*/
//            sysUserRoleDao.insertSysUserRoleByUserSelectRole(1,sysUserCustom.getId(),sysUserCustom.getRoleId(),sysUserCustom.getEnable(),1);
//        }
//        if (integer.equals(1)){
//            return integer;
//        }
//        return 0;
//    }
}
