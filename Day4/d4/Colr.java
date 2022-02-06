package co.demo.d4;

import java.util.Scanner;
public class Colr {

	public static void main(String[] args) {
		System.out.println("Enter any Letter:");
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		char letter = s.next().charAt(0);
		if(letter == 'R'|| letter=='r') {
			System.out.println("Red");
		}
		else if(letter=='B'|| letter=='b') {
			System.out.println("Blue");
		}
		else if(letter=='G' || letter=='g') {
			System.out.println("Green");
		}
		else if(letter=='O'|| letter=='o') {
			System.out.println("Orange");
		}
		else if(letter=='Y'|| letter=='y') {
			System.out.println("Yellow");
		}
		else if(letter=='W'|| letter=='w') {
			System.out.println("White");
		}
		else {
			System.out.println("Invalid code");
		}
	}

}