package com.amit.javaSpringWithAutowiredAnnotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Circle implements Shape{

	private Point center;
	
	public Point getCenter() {
		return center;
	}

	@Autowired
	@Qualifier("circleRelated")
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
	System.out.println("Circle Drawn with centre: "+ getCenter().getX() + " & " + getCenter().getY());
	}

}
