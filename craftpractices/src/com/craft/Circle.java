package com.craft;

public class Circle {
	int width = 12; //instance variable
	
	void getArea() {
		width = 23;   //local variable
	}
	

	public static void main(String[] args) {
		
		Circle c1 = new Circle();
		Circle c2 = new Circle();

		c1.getArea();
		System.out.println(c1.width);
		System.out.println(c2.width);
	}

}