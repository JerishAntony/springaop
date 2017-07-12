package com.sample.config;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SampleAspect {

	@Before("execution(public String getName())")
	public void TestAop(){
		System.out.println("wow");
	}
	
	@Pointcut("execution(* get*())")
	public void samplePOintcut(){
		System.out.println("ok"); //will not be executed
	}
	
	@After("samplePOintcut()")
	public void Testpointcut(){
		System.out.println("pointcut");
	}	
	
	@AfterThrowing(pointcut="args(name)",throwing="ex")
	public void testException(String name,Exception ex){
		System.out.println("after throwing exception="+name+",exception="+ex);
	}
	
	@AfterReturning(pointcut="samplePOintcut()",returning="ret")
	public void testafterReturn(String ret){
		System.out.println("after return="+ret);
	}
	@Before("samplePOintcut()")
	public void testJointpoint(JoinPoint jp){
		System.out.println("test joint point"+jp.toString());
		Test c = (Test) jp.getTarget();
		System.out.println("in joint point ="+c.getName());
	}
	
	@Before("args(String)")
	public void testTypeArgs(){
		System.out.println("method called with string args");
	}
	
	@Before("args(name)")
	public void testStringTypeArgs(String name){
		System.out.println("method called with args="+name);
	}
	
	@Before("args(t)")
	public void testobjectTypeArgs(InnerTest t){
		System.out.println("method called with Object args="+t);
	}
	
	@Around("execution(* com.sample.config.Test.aroundCheck(..))")
	public void arountTest(ProceedingJoinPoint pd) throws Throwable{
		System.out.println("before around processing");
		Object o = pd.proceed();
		System.out.println("after around process="+o.toString());
	}
	
	
}
