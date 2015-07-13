package com.spring.javabrains.applicationcontext;

public class Circle1 {

	private Point center;

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}
	
	public void draw(){
		System.out.println("Circle Drawn with center : ("+center.getX()+","+center.getY()+")");
	}
}
