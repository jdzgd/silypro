package com.gk.service;

import com.gk.entity.SysMenuVo;
import com.gk.entity.SysRole;

import java.util.List;

/**
 * @author
 * @date 2018/1/8
 */
public interface SysMenuService {
    /**
     *2018年1月8日,通过角色的ID获取菜单
     */
    List<SysMenuVo> getMenuByRoleId(SysRole sysRole);
}
