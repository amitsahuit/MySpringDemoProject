package com.amit.javaSpringWithStereotypeAnnotations;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DrawingApp {

	public static void main(String[] args) {

		AbstractApplicationContext context = new ClassPathXmlApplicationContext("StereotypeAnnotationsSpring.xml");
		context.registerShutdownHook();
		
		Shape shape = (Shape) context.getBean("circle");
		shape.draw();
	}
}
