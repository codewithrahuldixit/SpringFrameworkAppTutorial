package com.confiugration.demo03;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BasicDrawingApp03 {

	public static void main(String[] args) {
		
		var context = new AnnotationConfigApplicationContext(ConfDemo.class);
		System.out.println(context.getBean("name"));
		System.out.println(context.getBean("getPerson"));
		System.out.println(context.getBean("getPerson1"));
		// No qualifying bean of type 'com.confiugration.demo03.Person' 
		//available: expected single matching bean but found 2: getPerson,getPerson1
		System.out.println(context.getBean(Person.class));
		
		Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
	}

}
