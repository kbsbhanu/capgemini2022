package com.d5;

import java.util.Scanner;

public class RepeatLastNChars {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String str=sc.nextLine();
	int a=sc.nextInt();
	int l = str.length();
	for(int i=0;i<a;i++) {
		System.out.print(str.substring(l-a,l));
	}
		
	}
}