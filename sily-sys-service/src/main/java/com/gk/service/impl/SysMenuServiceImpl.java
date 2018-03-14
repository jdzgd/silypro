package com.gk.service.impl;


import com.gk.entity.SysMenuVo;
import com.gk.entity.SysRole;
import com.gk.repository.SysMenuDao;
import com.gk.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lime
 * @date 2018/1/8
 */
@Service
public class SysMenuServiceImpl implements SysMenuService {
    @Autowired
    private SysMenuDao sysMenuDao;

    @Override
    public List<SysMenuVo> getMenuByRoleId(SysRole sysRole) {
        System.out.println(sysRole.getId().intValue());
        return sysMenuDao.getMenuByRoleId(sysRole.getId().intValue());
    }
}
