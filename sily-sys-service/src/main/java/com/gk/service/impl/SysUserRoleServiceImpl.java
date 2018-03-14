package com.gk.service.impl;

import com.gk.entity.SysUserRole;
import com.gk.repository.SysUserRoleDao;
import com.gk.service.SysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserRoleServiceImpl implements SysUserRoleService {
    @Autowired
    private SysUserRoleDao sysUserRoleDao;
    @Override
    public long getSysUserRoleRowCount(){
        return sysUserRoleDao.getSysUserRoleRowCount();
    }
    @Override
    public List<SysUserRole> selectSysUserRole(){
        return sysUserRoleDao.selectSysUserRole();
    }
    @Override
    public SysUserRole selectSysUserRoleByObj(SysUserRole obj){
        return sysUserRoleDao.selectSysUserRoleByObj(obj);
    }
    @Override
    public SysUserRole selectSysUserRoleById(Long id){
        return sysUserRoleDao.selectSysUserRoleById(id);
    }
    @Override
    public int insertSysUserRole(SysUserRole value){
        return sysUserRoleDao.insertSysUserRole(value);
    }
    @Override
    public int insertNonEmptySysUserRole(SysUserRole value){
        return sysUserRoleDao.insertNonEmptySysUserRole(value);
    }
    @Override
    public int insertSysUserRoleByBatch(List<SysUserRole> value){
        return sysUserRoleDao.insertSysUserRoleByBatch(value);
    }
    @Override
    public int deleteSysUserRoleById(Long id){
        return sysUserRoleDao.deleteSysUserRoleById(id);
    }
    @Override
    public int updateSysUserRoleById(SysUserRole enti){
        return sysUserRoleDao.updateSysUserRoleById(enti);
    }
    @Override
    public int updateNonEmptySysUserRoleById(SysUserRole enti){
        return sysUserRoleDao.updateNonEmptySysUserRoleById(enti);
    }

    public SysUserRoleDao getSysUserRoleDao() {
        return this.sysUserRoleDao;
    }

    public void setSysUserRoleDao(SysUserRoleDao sysUserRoleDao) {
        this.sysUserRoleDao = sysUserRoleDao;
    }

}