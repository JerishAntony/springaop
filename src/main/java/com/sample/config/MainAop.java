package com.sample.config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAop {

	
	public static void main(String[] args) {
		
		System.out.println("here");
		ApplicationContext cx= new ClassPathXmlApplicationContext("spring.xml");
		Test t=(Test) cx.getBean("test");
//		InnerTest t2= new InnerTest();
//		t2.setDummy("dude");
//		t.setT(t2);
		t.getName();
//		t.getT().setDummy("pogadang");
//		t.getT().exception("ok");
//		t.aroundCheck("around");
//		t.setName("jerry");
//		System.out.println(t.getName());
	}
}
