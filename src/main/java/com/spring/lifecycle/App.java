package com.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		AbstractApplicationContext c = new ClassPathXmlApplicationContext("com/spring/lifecycle/hello.xml");
		Student s = c.getBean("stu", Student.class);
		System.out.println(s);
		c.registerShutdownHook();
	}
}
