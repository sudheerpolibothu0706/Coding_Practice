package com.assignment.coding.practice;

import java.util.Scanner;

public class MarksOfStudentWithGrade {

public static void main(String[] args) {
	int submarks[]=new int[6];
	int totalmarks=0;
	double percentage;
	for(int i=0;i<6;i++) {
	System.out.println("enter the marks of each subject");
	
	Scanner sc=new Scanner(System.in);
	 submarks[i]=sc.nextInt();
	 totalmarks+=submarks[i];
	}
	System.out.println("Total marks of a student: "+totalmarks);
	percentage=(double)totalmarks/600*100;
	System.out.println(percentage);
}
}
