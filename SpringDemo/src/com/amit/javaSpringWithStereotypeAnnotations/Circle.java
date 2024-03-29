package com.amit.javaSpringWithStereotypeAnnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;
import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Controller;
//import org.springframework.stereotype.Repository;
//import org.springframework.stereotype.Service;

@Component
//@Service
//@Repository
//@Controller
public class Circle implements Shape{

	private Point center;
	
	public Point getCenter() {
		return center;
	}

	@Resource(name="ThirdPoint")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
	System.out.println("Circle Drawn with centre: "+ getCenter().getX() + " & " + getCenter().getY());
	}

	@PostConstruct
	public void initializeCircle() {
		System.out.println("Inside initializeCircle");

	}
	
	@PreDestroy
	public void destroyCircle() {
		System.out.println("Inside destroyCircle");

	}
}

