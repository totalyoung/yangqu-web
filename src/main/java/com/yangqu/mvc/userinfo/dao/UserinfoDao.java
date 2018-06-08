package com.yangqu.mvc.userinfo.dao;

import com.yangqu.common.dao.Dao;
import com.yangqu.datasource.DatabaseType;

import java.util.List;
import java.util.Map;

/**
 * 玩家信息表 数据操作接口
 */

public interface UserinfoDao extends Dao {

    List<Map<String,Object>> selectList();
}