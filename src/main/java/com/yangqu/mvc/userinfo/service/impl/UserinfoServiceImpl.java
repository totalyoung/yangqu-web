package com.yangqu.mvc.userinfo.service.impl;


import javax.annotation.Resource;

import com.yangqu.common.service.ServiceSupport;
import com.yangqu.mvc.userinfo.dao.UserinfoDao;
import com.yangqu.mvc.userinfo.service.UserinfoService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


/**
 * 玩家信息表 业务操作接口实现类
 */
@Service("userinfoService")
public class UserinfoServiceImpl extends ServiceSupport implements UserinfoService {
	
	@Resource
	private UserinfoDao userinfoDao;

	public UserinfoDao getDao() {
		return userinfoDao;
	}

	public void setUserinfoDao(UserinfoDao userinfoDao) {
		this.userinfoDao = userinfoDao;
	}

	@Override
	public List<Map<String, Object>> selectList() {
		return userinfoDao.selectList();
	}
}