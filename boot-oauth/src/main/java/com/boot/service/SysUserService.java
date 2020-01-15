package com.boot.service;


import com.boot.base.BaseService;
import com.boot.entity.SysRoleUser;
import com.boot.entity.SysUser;
import com.boot.util.Checkbox;
import com.boot.util.JsonUtil;

import java.util.List;

/**
 * @author zhuxiaomeng
 * @date 2017/12/4.
 * @email 154040976@qq.com
 */
public interface SysUserService extends BaseService<SysUser,String> {

  SysUser login(String username);


  SysUser selectByPrimaryKey(String id);

  /**
   * 分页查询
   * @param
   * @return
   */
  @Override
  List<SysUser> selectListByPage(SysUser sysUser);

  int count();

  /**
   * 新增
   * @param user
   * @return
   */
  int add(SysUser user);

  /**
   * 删除
   * @param id
   * @return
   */
  JsonUtil delById(String id, boolean flag);

  int checkUser(String username);



  @Override
  int updateByPrimaryKey(SysUser sysUser);

  List<SysRoleUser> selectByCondition(SysRoleUser sysRoleUser);

  public List<Checkbox> getUserRoleByJson(String id);

  /**
   * 更新密码
   * @param user
   * @return
   */
  int rePass(SysUser user);


  List<SysUser> getUserByRoleId(String roleId);

  public void setMenuAndRoles(String username);

  public void updateCurrent(SysUser user);
}
