package com.demo.assgn;

class Circle {
	void Area(double radius) {
		double result = 3.17 * radius;
		System.out.println("The Area of circle is: "+result);
	}
	// return type
	double Area(double length, double breadth) {
		double result = length * breadth;
		return result;
	}
}
public class MethodOverloadingEx {
	public static void main(String ar[]) {
		Circle c = new Circle();
		c.Area(8.90);
		double temp = c.Area(14.12, 10.12);
		System.out.println("The area of rect is:"+temp);
	}
}