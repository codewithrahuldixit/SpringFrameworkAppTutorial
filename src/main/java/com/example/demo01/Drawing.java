package com.example.demo01;

public class Drawing {
Circle circle;

public Circle getCircle() {
	return circle;
}

public void setCircle(Circle circle) {
	this.circle = circle;
}

public Drawing(Circle circle) {
	super();
	this.circle = circle;
}
public void draw() {
	System.out.println(circle + "    is Drawing " );
}

}
