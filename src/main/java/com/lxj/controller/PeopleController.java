package com.lxj.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lxj.bean.People;
import com.lxj.service.PeopleService;
import com.lxj.service.Impl.PeopleServiceImpl;
import com.lxj.util.LoggerUtil;


@Controller
public class PeopleController {

	protected LoggerUtil logger = LoggerUtil.getLogger(this.getClass());
	
	@Autowired
	private PeopleService peopleService;
	
	@Autowired
	private PeopleServiceImpl peopleServiceImpl;
	
	@RequestMapping("/main")
	public String test() {
		List<People> list = peopleService.findAll();
		for (People p: list) {
			System.out.println(p.getId()+"-name:"+p.getName()+" password:"+p.getPassword());
		}
		return "main";
	}
	
	@RequestMapping("/main2")
	@ResponseBody
	public Map<String, Object> test2() {
		List<People> list = peopleServiceImpl.findAll();
		for (People p: list) {
			System.out.println(p.getId()+"-name:"+p.getName()+" password:"+p.getPassword());
		}
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("people", list);
		//≤‚ ‘logger
		logger.info(result);
		return result;
	}
	
}
