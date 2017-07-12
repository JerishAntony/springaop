package com.sample.config;

public class InnerTest {

	private String dummy;

	@Override
	public String toString() {
		return "InnerTest [dummy=" + dummy + "]";
	}

	public String getDummy() {
		return dummy;
	}

	public void setDummy(String dummy) {
		this.dummy = dummy;
	}
	
	public void exception(String value){
		throw new RuntimeException("awesome asesome");
	}
}
