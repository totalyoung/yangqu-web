package com.yangqu.mvc.userinfo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.yangqu.common.PageView;
import com.yangqu.mvc.userinfo.entity.Userinfo;
import com.yangqu.mvc.userinfo.service.UserinfoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



/**
 * 玩家信息表 控制器
 */
@Controller
@RequestMapping("/user")
public class UserinfoWebController  {

	@Resource
	private UserinfoService userinfoService;

//	/**
//	 * 进入玩家信息表详情页面
//	 * @param id
//	 * @param model 数据模型
//	 * @return String 视图名称
//	 */

//	@RequestMapping(value="{id}.htm",method={RequestMethod.GET})
//	public String view(@PathVariable("id") int id, Model model){
//		Userinfo userinfo = userinfoService.get(id);
//		model.addAttribute("userinfo", userinfo);
//		return "userinfo/userinfoView";
//	}


	@ResponseBody
	@RequestMapping(value="{id}.htm",method={RequestMethod.GET})
	public Userinfo view(@PathVariable("id") int id){
		return userinfoService.get(id);
	}



	@ResponseBody
	@RequestMapping(value="activeList.htm",method={RequestMethod.GET,RequestMethod.POST})
	public PageView activeList(@ModelAttribute Userinfo userinfo, Model model) {
		userinfo.setUserId(100000001L);
		List<Userinfo> list = userinfoService.findList(userinfo);
		//userinfoService.selectList();
		PageView p = new PageView();
		p.setRecords(list);
		return p;
	}

	@RequestMapping(value="active",method={RequestMethod.GET,RequestMethod.POST})
	public String active() {
		return "user/active";
	}


	@ResponseBody
	@RequestMapping(value="onlineTimeList.htm",method={RequestMethod.GET,RequestMethod.POST})
	public PageView onlineTimeList(@ModelAttribute Userinfo userinfo, Model model) {
		PageView p = new PageView();
		return p;
	}

	@RequestMapping(value="onlineTime",method={RequestMethod.GET,RequestMethod.POST})
	public String onlineTime() {
		return "user/onlineTime";
	}


	@RequestMapping(value="onlineNumber",method={RequestMethod.GET,RequestMethod.POST})
	public String onlineNumber(Model model) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		model.addAttribute("numbers",list.toString());
		return "user/onlineNumber";
	}

	@RequestMapping(value="onlineAverageList.htm",method={RequestMethod.GET,RequestMethod.POST})
	public PageView onlineAverageList() {
		return new PageView();
	}

	@RequestMapping(value="onlineAverage",method={RequestMethod.GET,RequestMethod.POST})
	public String onlineAverage(Model model) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		model.addAttribute("numbers",list.toString());
		return "user/onlineAverage";
	}

	@RequestMapping(value="onlineNumberList.htm",method={RequestMethod.GET,RequestMethod.POST})
	public PageView onlineNumberList() {
		return new PageView();
	}

	@RequestMapping(value="level",method={RequestMethod.GET,RequestMethod.POST})
	public String level(Model model) {
		return "user/level";
	}

	@RequestMapping(value="info",method={RequestMethod.GET,RequestMethod.POST})
	public String info(Model model) {
		return "user/info";
	}

	@RequestMapping(value="infoList.htm",method={RequestMethod.GET,RequestMethod.POST})
	public PageView infoList() {
		return new PageView();
	}

	@RequestMapping(value="demo",method={RequestMethod.GET,RequestMethod.POST})
	public String demo() {
		return "welcome2";
	}

	@RequestMapping(value="demo2",method={RequestMethod.GET,RequestMethod.POST})
	public String demo2() {
		return "basic";
	}
}