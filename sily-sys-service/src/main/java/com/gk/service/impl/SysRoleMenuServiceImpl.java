package com.gk.service.impl;

import com.gk.entity.SysRole;
import com.gk.entity.SysRoleMenu;
import com.gk.repository.SysRoleMenuDao;
import com.gk.service.SysRoleMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lime
 * @date 2018/1/9
 */
@Service
public class SysRoleMenuServiceImpl implements SysRoleMenuService {
    @Autowired
    SysRoleMenuDao sysRoleMenuDao;

    /**
     * 通过角色的ID获取菜单的CRUD权限
     * @param sysRole 角色实体类，目前仅需要id
     *@return java.util.List<com.sily.api.SysRoleMenu>
     *Date: 2018/1/9
     */
    @Override
    public List<SysRoleMenu> getMenuPermissionByRoleId(SysRole sysRole) {
        return sysRoleMenuDao.getMenuPermissionByRoleId(sysRole.getId());
    }
}
