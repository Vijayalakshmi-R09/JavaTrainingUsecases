package com.srm.javatrainingex;

import java.util.Scanner;

public class Squareroot {

	public static void main(String[] args) {
		System.out.print("Enter a number: ");  
		Scanner sc = new Scanner(System.in);  
		int num = sc.nextInt();  
		System.out.println("The square root of "+num+ " : "+squareRoot(num));  
		}  
	public static double squareRoot(int n)   
	{  
		double t;  
		double s=n/2;  
		do   
		{  
			t=s;  
			s=(t+(n/t))/2;  
		}   
		while((t-s)!= 0);  
		return s;  
	}  
}
		