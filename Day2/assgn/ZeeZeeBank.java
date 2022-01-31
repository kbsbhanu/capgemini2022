package com.demo.assgn;
import java.util.Scanner;

public class ZeeZeeBank {
	public static void main(String args[]) {
		 String account_num="9876543210";
		 int i_bal=15000;
		 int dep_amount,with_amnt;
		 
		 System.out.println("Enter the deposited amount");
		 Scanner s= new Scanner(System.in);
		 dep_amount=s.nextInt();
		 
		 
		 System.out.println("Enter the withdrawing amount");
		 with_amnt=s.nextInt();
		 
		 int avai_bal;
		 avai_bal=i_bal+dep_amount;
		 
		 if(with_amnt>avai_bal) {
			 System.out.println("Insufficient balance");
		 }
		 else {
			 avai_bal-=with_amnt;
		 }
		 
		 
		 System.out.println("The available balance is:"+avai_bal);
		 
		 
		 
			}

}
