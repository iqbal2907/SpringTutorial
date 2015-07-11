package com.spring.javabrains.applicationcontext;

public class Triangle2 {

	private String type;
	private int height;

	public Triangle2(String type) {
		System.out.println("Triangle2(String type) constructor executed");
		this.type = type;
	}

	public Triangle2(int height) {
		System.out.println("Triangle2(int height) constructor executed");
		this.height = height;
	}

	public Triangle2(String type, int height) {
		System.out.println("Triangle2(String type, int height) constructor executed");
		this.type = type;
		this.height = height;
	}
	
	public void draw(){
		System.out.println(type+" triangle drawn with height : "+height);
	}
}
