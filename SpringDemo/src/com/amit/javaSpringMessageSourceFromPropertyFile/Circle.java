package com.amit.javaSpringMessageSourceFromPropertyFile;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;

public class Circle implements Shape{

	private Point center;
	
	@Autowired
	private MessageSource messagesource;
	
	public MessageSource getMessagesource() {
		return messagesource;
	}

	public void setMessagesource(MessageSource messagesource) {
		this.messagesource = messagesource;
	}

	public Point getCenter() {
		return center;
	}

	@Resource(name="ThirdPoint")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
	
	//System.out.println("Drawing Circle:");
	System.out.println(this.messagesource.getMessage("drawing.circle", null, "default Drawing Message", null));
	//System.out.println("Circle point is: " +getCenter().getX() + " & " + getCenter().getY());
	System.out.println(this.messagesource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()}, "default Point Message", null));
	//System.out.println(this.messagesource.getMessage("greeting", null, "default greeting", null));
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

