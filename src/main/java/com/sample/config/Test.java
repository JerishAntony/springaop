package com.sample.config;

public class Test {
	
	InnerTest t;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public InnerTest getT() {
		return t;
	}

	public void setT(InnerTest t) {
		this.t = t;
	}

	public String aroundCheck(String around){
		
		System.out.println("aroundcheck methos processing");
		return "returned";
	}
}
