package com.vishal.spring.aop.data;

import org.springframework.stereotype.Repository;

import com.vishal.spring.aop.aspect.Track;

@Repository
public class Dao {
	
	@Track
	public String retrieveSomething() {
		return "DAO1";
	}

}
