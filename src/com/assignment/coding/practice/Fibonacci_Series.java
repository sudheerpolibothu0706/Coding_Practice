package com.assignment.coding.practice;

public class Fibonacci_Series {
public static void main(String[] args) {
	int firstNo=0;
	int secondNo=1;
	System.out.print(firstNo+","+secondNo);
	for(int i=0;i<8;i++) {
		int result=firstNo+secondNo;
		System.out.print(","+result);
		firstNo=secondNo;
		secondNo=result;
	}
}
}
