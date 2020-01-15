package com.boot.mapper;

import com.boot.base.BaseMapper;
import com.boot.entity.ActAssignee;

public interface ActAssigneeMapper extends BaseMapper<ActAssignee,String> {
    int deleteByNodeId(String nodeId);
}