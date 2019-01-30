package com.lxj.service.Impl;

import java.util.List;

import javax.annotation.Resource;

import com.lxj.bean.People;
import com.lxj.dao.DaoSupport;


public class PeopleServiceImpl2 {

	@Resource(name = "daoSupport")
	private DaoSupport dao;
	
	/*
	*列表(全部)
	*/
	public List<People> listAll()throws Exception{
		return (List<People>)dao.findForList("PersonMapper.listAll", null);
	}
}
