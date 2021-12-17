package com.vishal.spring.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	
	@Pointcut("execution(* com.vishal.spring.aop.data.*.*(..))")
	public void dataLayerExecution() {}
	
	
	@Pointcut("@annotation(com.vishal.spring.aop.aspect.Track)")
	public void trackTimeAnnotation(Track track) {
		
	}
	
}
