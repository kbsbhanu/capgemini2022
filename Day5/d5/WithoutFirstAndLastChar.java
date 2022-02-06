package com.d5;

import java.util.Scanner;
public class WithoutFirstAndLastChar {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s1=sc.nextLine();
	int n=s1.length();
	//String s2=s1.substring(0, n);
	System.out.println(n);
	String s2=s1.substring(1,n-1);
     System.out.println(s2 );
		
		
	}
}