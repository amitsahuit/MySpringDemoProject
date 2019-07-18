package com.amit.javaSpringEventHandling;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.context.MessageSource;

public class Circle implements Shape, ApplicationEventPublisherAware{

	private Point center;
	private ApplicationEventPublisher publisher;
	
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

	@Override
	public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
		
	}
	
	@Resource(name="ThirdPoint")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
		System.out.println(this.messagesource.getMessage("drawing.circle", null, "default Drawing Message", null));
		System.out.println(this.messagesource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()}, "default Point Message", null));
		
		DrawEvent drawEvent = new DrawEvent(this);
		publisher.publishEvent(drawEvent);
	
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

