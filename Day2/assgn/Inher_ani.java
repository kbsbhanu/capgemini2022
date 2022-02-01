/*1     Create a class named ‘Animal’ which includes methods like eat() and sleep().
Create a child class of Animal named ‘Bird’ and override the parent class methods. Add a new method named fly().
Create an instance of Animal class and invoke the eat and sleep methods using this object.Create an instance of Bird class and invoke the eat, sleep and fly methods using this object.*/


package com.demo.assgn;
class Animal {
	void eat() {
		System.out.println("Animal Eats");
	}
	
	void sleep() {
		System.out.println("Animal Sleeps");
	}
}
class Bird extends Animal{
	void eat() {
		System.out.println("Bird Eats");
	}
	void sleep() {
		System.out.println("Bird sleeps");
	}
	void fly() {
		System.out.println("Bird flies");
	}
}
public class Inher_ani {
	public static void main(String args[]) {
		Animal a=new Animal();
		a.eat();
		a.sleep();
		Bird b=new Bird();
		b.eat();
		b.sleep();
		b.fly();
		
		//a.fly();
	}

}
