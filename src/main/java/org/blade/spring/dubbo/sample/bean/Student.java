package org.blade.spring.dubbo.sample.bean;

public class Student {

	private String name;
	
	private int sex;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public Student(String name, int sex) {
		super();
		this.name = name;
		this.sex = sex;
	}
	
}
