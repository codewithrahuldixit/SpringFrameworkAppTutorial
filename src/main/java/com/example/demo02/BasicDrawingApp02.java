package com.example.demo02;

public class BasicDrawingApp02 {

	public static void main(String[] args) {
		
	var shape = new Circle(20);
	//var shape = new Rectangle(20,30);
		var drawing = new Drawing(shape);
		drawing.draw();
		

	}

}
