package com.demo.assgn;
import java.util.Scanner;
class Numerology_prblm {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int sum=calc(n);
        if(sum<10)
        	System.out.println("numerology num is: "+sum);
        else
        	System.out.println("numerology num is: "+numerology_num(sum));
        even_odd(n);
    }     
        
        public static int calc(int n) {
        	int sum=0,temp=n;
        	while(temp>0){
        		int rem=temp%10;
        		sum+=rem;
        		temp=temp/10;
        	}
        	return sum;
        	
        }
        public static void even_odd(int n) {
        	int even=0,odd=0;
        	while(n>0) {
        		int rem=n%10;
        		if(rem%2==0)
        			even++;
        		else
        			odd++;
        		n=n/10;
        	}
        	System.out.println("\nNumber of odd numbers:"+odd+"\nNumber of even numbers:"+even);
        	
        }
        public static int numerology_num(int n) {
        	int sum=0,temp=n;
        	while(temp>0) {
        		int rem=temp%10;
        		sum+=rem;
        		temp=temp/10;
        	}
        	if(sum>=10)
        		return numerology_num(sum);
        	else
        		return sum;
        			
        	
        }
        
}