package com.vishal.spring.aop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AroundAspect {
	
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Around("execution(* com.vishal.spring.aop.bussiness.*.*(..))")
	public void around(ProceedingJoinPoint joinPoint) throws Throwable {
        
		long startTime = System.currentTimeMillis();
		
		joinPoint.proceed();
		
		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("Time Taken by {} is {}",joinPoint,timeTaken);
	}
	
	@Pointcut("@within(track)")
	public void underTraceEnterExit(Track track) {
		// declaration
	}
	
	@Around("underTraceEnterExit(track)")
	public void aroundwithAnnotation(ProceedingJoinPoint joinPoint, Track track) throws Throwable {
        
		long startTime = System.currentTimeMillis();
		
		joinPoint.proceed();
		
		long timeTaken = System.currentTimeMillis() - startTime;
		logger.info("Time Taken by {} is {}",joinPoint,timeTaken);
	}
	
	//com.vishal.spring.aop.aspect.CommonJoinPointConfig.trackTimeAnnotation()

}
