package com.chertov.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class LogginAspect {

	@Before("execution(public String getName())")
	public void loggingAdvice(){
		System.out.println("Advice run. Get method call");
	}

}
