package com;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component("myAop")
@Aspect
public class MyAOP {

	@Before("execution(void set*(*))")
	public void testMethods(JoinPoint jp) {
		System.out.println("--- setter method About to call on "+jp.getSignature());
	}
	
	@After("execution(void set*(*))")
	public void testMethod1(JoinPoint jp) {
		System.out.println("--- setter method got called on "+jp.getSignature());
	}
	
	@Before("execution(* get*())")
	public void testMethod2(JoinPoint jp) {
		System.out.println("--- getter method About to call on "+jp.getSignature());
	}

}
