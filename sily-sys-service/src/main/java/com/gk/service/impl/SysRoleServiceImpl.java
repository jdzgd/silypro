package com.gk.service.impl;

import com.gk.entity.SysRole;
import com.gk.repository.SysRoleDao;
import com.gk.service.SysRoleService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:
 * @Version: V 1.0
 * @Description:
 * @Date: Created in 14:14 2018/1/6
 * @Modified By:
 **/
@Service
public class SysRoleServiceImpl implements SysRoleService {

    @Autowired
    SysRoleDao sysRoleDao;

    /**
     * 获得SysRole数据集合
     * @return List<SysRole>
     */
    @Override
    public List<SysRole> selectSysRole() {
        return sysRoleDao.selectSysRole();
    }
}
