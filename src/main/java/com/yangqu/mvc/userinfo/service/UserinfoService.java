package com.yangqu.mvc.userinfo.service;


import com.yangqu.common.service.Service;

import java.util.List;
import java.util.Map;

/**
 * 玩家信息表 业务操作接口
 */

public interface UserinfoService extends Service {

    List<Map<String,Object>> selectList();

}