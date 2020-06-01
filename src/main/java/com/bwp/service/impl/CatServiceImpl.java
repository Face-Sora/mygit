package com.bwp.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bwp.dao.CatMapper;
import com.bwp.pojo.Cat;
import com.bwp.pojo.CatExample;
import com.bwp.service.CatService;

@Service
public class CatServiceImpl implements CatService{

	@Autowired
	CatMapper cm;
	

	public List<Cat> showAll() {
		// TODO Auto-generated method stub
		return cm.selectByExample(new CatExample());
	}
}
