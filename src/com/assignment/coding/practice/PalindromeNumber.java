package com.assignment.coding.practice;

public class PalindromeNumber {
public static void main(String[] args) {
	int number=121;
	int temp=number;
	int result=0;
	
	
	while(number!=0) {
		int remainder=number%10;
	result=result*10+remainder;
	
	number=number/10;
	
	}
	if(temp==result) {
	System.out.println(result+" is a palindrome number");
	}
	else {
		System.out.println(temp+" is not a palindrome number");
	}
}
}
