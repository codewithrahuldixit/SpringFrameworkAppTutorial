package com.example.SampleApp01;

import org.springframework.stereotype.Component;

@Component
public class Drawing {
Shape shape;

public Shape getCircle() {
	return shape;
}

public void setCircle(Shape shape) {
	this.shape = shape;
}

public Drawing(Shape shape) {
	super();
	this.shape = shape;
}
public void draw() {
	System.out.println(shape + "    is Drawing " );
}

}
