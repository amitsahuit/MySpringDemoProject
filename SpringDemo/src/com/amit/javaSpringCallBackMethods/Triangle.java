package com.amit.javaSpringCallBackMethods;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Triangle implements InitializingBean, DisposableBean{

	private Point pointA;
	private Point pointB;
	private Point pointC;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("InitializingBean");
		
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("DisposableBean");
		
	}
	
	public void myInit() {
		System.out.println("My Init method call");
	}
	
	public void myDestroy() {
		System.out.println("My Destroy method call");
	}
	
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
	System.out.println("Point A has coordinates: " +getPointA().getX()+ ", " +getPointA().getY());
	System.out.println("Point B has coordinates: " +getPointB().getX()+ ", " +getPointB().getY());
	System.out.println("Point C has coordinates: " +getPointC().getX()+ ", " +getPointC().getY());
	}

}