package com.demo.assgn;

import java.util.Scanner;

class Fruitss{
	String name;
	String taste;
	String size;
	
	void eat() {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter fruit name:");
		name = s.nextLine();
		System.out.println("Enter fruit taste:");
		taste = s.nextLine();
		System.out.println("Enter fruit size:");
		size = s.nextLine();
		
		System.out.println("The Fruit name is: " + name);
		System.out.println("It tastes like: " + taste);
		
		s.close();
		
	}
}


class Apple extends Fruitss{
	void eat() {
		System.out.println("This is Apple!!");
		System.out.println("I am sweet");
	}
}

class Orange extends Fruitss{
	void eat() {
		System.out.println("This is Orange!!");
		System.out.println("I am sour");
	}
}
public class Fruits{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruitss f = new Fruitss();
		f.eat();

	}

}