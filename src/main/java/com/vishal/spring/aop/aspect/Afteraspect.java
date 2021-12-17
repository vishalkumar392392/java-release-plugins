package com.vishal.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class Afteraspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@AfterReturning(value ="execution(* com.vishal.spring.aop.bussiness.*.*(..))"
			,returning = "result")
	public void before(JoinPoint joinPoint,Object result) {
		
          logger.info("{} returned with value {}",joinPoint,result);		
	}
	
	@AfterThrowing(value ="execution(* com.vishal.spring.aop.bussiness.*.*(..))"
			,throwing = "exception")
	public void afterThrowing(JoinPoint joinPoint,Exception exception) {
		
        logger.info("{} returned with value {}",joinPoint,exception);		

	}
	
	@After(value ="execution(* com.vishal.spring.aop.bussiness.*.*(..))"
			)
	public void after(JoinPoint joinPoint) {
		
          logger.info("{} ",joinPoint);		
	}
}
