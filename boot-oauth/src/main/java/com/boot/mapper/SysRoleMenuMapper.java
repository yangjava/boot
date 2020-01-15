package com.boot.mapper;

import com.boot.base.BaseMapper;
import com.boot.entity.SysRoleMenu;

import java.util.List;

public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu, String> {
    List<SysRoleMenu> selectByCondition(SysRoleMenu sysRoleMenu);

    int selectCountByCondition(SysRoleMenu sysRoleMenu);
}