
/*  Create a class called compartment which represents the ship compartments for watertight subdivision its height, width and breadth. 
Take care it should not conflict with the compartment class you have created in Abstract class exercise 2.
To avoid conflict create this class in a new package called com.demo*/
package com.demo.assgn;
import java.util.*;
class Compartment {
	double height;
	double width;
	double breadth;
	public Compartment(double ht, double wdth,double brdth) {
		height = ht;
		width = wdth;
		breadth = brdth;
	}
	
}
public class Compartmnt_Ship {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Compartment compartment = new Compartment(51.8,4.3,14.5);
		
		System.out.println(compartment.height);
		System.out.println(compartment.width);
		System.out.println(compartment.breadth);


	}

}