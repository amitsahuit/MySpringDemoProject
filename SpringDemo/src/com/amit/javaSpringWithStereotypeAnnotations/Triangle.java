package com.amit.javaSpringWithStereotypeAnnotations;

public class Triangle implements Shape{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	public Point getPointA() {
		return pointA;
	}

	public void setPointA(Point pointA) {
		this.pointA = pointA;
	}

	public Point getPointB() {
		return pointB;
	}

	public void setPointB(Point pointB) {
		this.pointB = pointB;
	}

	public Point getPointC() {
		return pointC;
	}

	public void setPointC(Point pointC) {
		this.pointC = pointC;
	}

	public void draw() {
	System.out.println("Triangle Drawn");
	System.out.println("Point A has coordinates: " +getPointA().getX()+ ", " +getPointA().getY());
	System.out.println("Point B has coordinates: " +getPointB().getX()+ ", " +getPointB().getY());
	System.out.println("Point C has coordinates: " +getPointC().getX()+ ", " +getPointC().getY());
	}

}
