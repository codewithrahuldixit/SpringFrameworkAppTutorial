package com.example.demo01;

public class Circle {
int radius;

public Circle() {
	radius = 0;
	}

public Circle(int radius) {
	super();
	this.radius = radius;
}

public int getRadius() {
	return radius;
}

public void setRadius(int radius) {
	this.radius = radius;
}

@Override
public String toString() {
	return "Circle [radius=" + radius + "]";
}

}
