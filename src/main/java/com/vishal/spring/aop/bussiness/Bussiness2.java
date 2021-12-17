package com.vishal.spring.aop.bussiness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vishal.spring.aop.data.Dao2;

@Service
public class Bussiness2 {

	@Autowired
	private Dao2 dao;
	
	public String calculateSomething() {
		return dao.retrieveSomething();
	}
}
