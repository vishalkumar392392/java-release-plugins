package com.vishal.spring.aop;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.vishal.spring.aop.bussiness.Bussiness1;
import com.vishal.spring.aop.bussiness.Bussiness2;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner {

	@Autowired
	private Bussiness1 bussiness1;
	
	@Autowired
	private Bussiness2 bussiness2;
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());

	
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// test comments test1 test2 test3
		logger.info("{}->"+ bussiness1.calculateSomething());
		
		logger.info("{}->"+ bussiness2.calculateSomething());
	}

}
