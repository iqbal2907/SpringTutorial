package com.spring.javabrains.applicationcontext;

public class Triangle1 {
	
	
	private String typeForSetterInvocation;
	private String typeForConstructorInvocation;

	public Triangle1(String typeForConstructorInvocation){
		this.typeForConstructorInvocation = typeForConstructorInvocation;
	}

	public String getTypeForSetterInvocation() {
		return typeForSetterInvocation;
	}

	public void setTypeForSetterInvocation(String typeForSetterInvocation) {
		this.typeForSetterInvocation = typeForSetterInvocation;
	}

	public void draw() {
		System.out.println(typeForSetterInvocation+" tringle Drawn through setter invocation");
		System.out.println(typeForConstructorInvocation+" tringle Drawn through constructor invocation");
	}

}
