package com.lxj.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lxj.bean.People;
import com.lxj.dao.PeopleDao;
import com.lxj.service.PeopleService;

@Service("personService")
public class PeopleServiceImpl implements PeopleService{

	@Autowired
	private PeopleDao peopleDao;
	
	
	
	public PeopleDao getPeopleDao() {
		return peopleDao;
	}



	public void setPeopleDao(PeopleDao peopleDao) {
		this.peopleDao = peopleDao;
	}



	public List<People> findAll() {
		// TODO Auto-generated method stub
		return peopleDao.findAll();
	}

	
}
