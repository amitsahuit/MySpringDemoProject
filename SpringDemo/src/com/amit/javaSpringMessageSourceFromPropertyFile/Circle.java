package com.amit.javaSpringMessageSourceFromPropertyFile;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.context.MessageSource;

public class Circle implements Shape{

	private Point center;
	private MessageSource messagesource;
	
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

