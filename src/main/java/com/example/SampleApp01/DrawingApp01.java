package com.example.SampleApp01;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.SampleApp01")
public class DrawingApp01 {

	public static void main(String[] args) {
		
			var context = new AnnotationConfigApplicationContext(DrawingApp01.class);
			var d1 = context.getBean(Drawing.class);
			d1.draw();
			
	}

}
