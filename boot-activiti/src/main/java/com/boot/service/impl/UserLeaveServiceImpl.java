package com.boot.service.impl;

import com.boot.base.BaseMapper;
import com.boot.base.impl.BaseServiceImpl;
import com.boot.entity.UserLeave;
import com.boot.mapper.UserLeaveMapper;
import com.boot.service.UserLeaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author zhuxiaomeng
 * @date 2018/1/21.
 * @email 154040976@qq.com
 */
@Service
public class UserLeaveServiceImpl extends BaseServiceImpl<UserLeave,String> implements
    UserLeaveService {

  @Autowired
  UserLeaveMapper userLeaveMapper;

  @Override
  public BaseMapper<UserLeave,String> getMappser() {
    return userLeaveMapper;
  }
}
