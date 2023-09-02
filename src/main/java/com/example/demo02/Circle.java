package com.example.demo02;

public class Circle implements Shape  {
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
