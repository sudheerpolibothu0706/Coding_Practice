package com.assignment.coding.practice;

public class PrimeOrNot {
public static void main(String[] args) {
	int no=13;
	int count=0;
	for(int i=1;i<=no;i++) {
		
		
			if(no%i==0) {
				
			count++;
		}
	}
	if(count==2) {
	System.out.println("Given number is a prime");
	}
	else {
		System.out.println(" Given Number is not a prime");
	}
}
}
