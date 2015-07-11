package com.spring.javabrains.applicationcontext;

public class Triangle3 {

	private Point a;
	private Point b;
	private Point c;
	
	public Point getA() {
		return a;
	}


	public void setA(Point a) {
		this.a = a;
	}


	public Point getB() {
		return b;
	}


	public void setB(Point b) {
		this.b = b;
	}


	public Point getC() {
		return c;
	}


	public void setC(Point c) {
		this.c = c;
	}


	public void draw() {
		System.out.println("Triangle drawn with points : \na = ("+a.getX()+","+a.getY()+")"+"\nb = ("+b.getX()+","+b.getY()+")"+"\nc = ("+c.getX()+","+c.getY()+")");
	}

}
