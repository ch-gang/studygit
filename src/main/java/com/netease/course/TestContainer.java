package com.netease.course;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestContainer {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		
		File file = context.getBean("file", FileWriterService.class);
		System.out.println(file.getInfo());
		file.write("content");
		
		((ConfigurableApplicationContext) context).close();
	}
}
