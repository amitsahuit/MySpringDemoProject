package com.amit.javaSpringWithInterface;

public class Circle implements Shape{

	private Point center;
	
	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw() {
	System.out.println("Circle Drawn with centre: "+ getCenter().getX() + " & " + getCenter().getY());
	}

}
