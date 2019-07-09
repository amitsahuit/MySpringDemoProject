package com.amit.javaSpringWithJSR250Annotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("JSR250AnnotationsSpring.xml");
		context.registerShutdownHook();
		
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
	}
}
