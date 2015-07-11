package com.spring.javabrains.applicationcontext;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DrawingApp {

	public static void main(String[] args){

		ApplicationContext applicationContext1 = new ClassPathXmlApplicationContext("spring1.xml");
		Triangle1 triangle1 = (Triangle1) applicationContext1.getBean("triangle1");
		triangle1.draw();
		//  /SpringTutorial/src/com/spring/javabrains/applicationcontext/spring.xml
		//  /SpringTutorial/src/classpathspring.xml

		
		ApplicationContext applicationContext2 = new ClassPathXmlApplicationContext("spring2.xml");
		Triangle2 triangle2 = (Triangle2) applicationContext2.getBean("triangle2");
		triangle2.draw();
		

		ApplicationContext applicationContext3 = new ClassPathXmlApplicationContext("spring3.xml");
		Triangle3 triangle3 = (Triangle3) applicationContext3.getBean("triangle3");
		triangle3.draw();


	}

}
