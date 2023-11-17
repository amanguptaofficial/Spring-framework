package com.spring.lifecycle;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("stu")
public class Student {
	@Value("101")
	private int id;
	@Value("Aman")
	private String name;
	@Value("23")
	private int age;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void init() {
		System.out.println("Hey i am init method::::");
	}

	public void destroy() {
		System.out.println("Hey i am destroy method::::");
	}
}
