package com.boot.service;

import com.boot.base.BaseService;
import com.boot.entity.SysRoleMenu;

import java.util.List;

/**
 * @author zhuxiaomeng
 * @date 2017/12/28.
 * @email 154040976@qq.com
 */
public interface RoleMenuService extends BaseService<SysRoleMenu,String>{

    List<SysRoleMenu> selectByCondition(SysRoleMenu sysRoleMenu);

    int  selectCountByCondition(SysRoleMenu sysRoleMenu);

    int deleteByPrimaryKey(SysRoleMenu sysRoleMenu);
}
