package com.gk.repository;


import com.gk.entity.SysUser;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author:
 * @Version: V 1.0
 * @Description:
 * @Date: Created in 8:53 2018/1/4
 * @Modified By:
 **/
//@Repository
@Component
public interface SysLoginDao {
    /**
     * 查找用户名和密码
     * @param account 登录用户名
     * @return
     */
    SysUser selectByLoginName(String account);

    /**
     * 注册用户
     */
    Integer insertLoginSysUser(SysUser sysUser)throws Exception;

    /**
     * 更新用户信息
     */
    Integer updateSysUserByUserId(SysUser sysUser);
}
