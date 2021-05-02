package com.srm.javatrainingex;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		System.out.print("Enter the number: ");  
		Scanner sc = new Scanner(System.in);  
		int num = sc.nextInt();  
		reverseNum(num);
	}
	static void reverseNum(int n)
	{
		int rev=0,c,a=n;
		while(a!=0)
		{
			c=a%10;
			rev=rev*10+c;
			a=a/10;
		}
		System.out.println("The Reversal of Number "+n+" --> "+rev);
	}

}
