package com.amit.javaSpringCallBackMethods;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class DrawingApp {

	public static void main(String[] args) {
		//Triangle triangle = new Triangle();
		//BeanFactory factory = new XmlBeanFactory(new FileSystemResource("spring.xml"));
		//Triangle triangle = (Triangle) factory.getBean("triangle");
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("CallBackMethodSpring.xml");
		context.registerShutdownHook();
		Triangle triangle = (Triangle) context.getBean("TRI");
		triangle.draw();
	}
}
