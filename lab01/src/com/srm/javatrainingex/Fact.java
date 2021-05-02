package com.srm.javatrainingex;

import java.util.Scanner;

public class Fact {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int factr=factRecursive(num);
		int facti=factIterative(num);
		System.out.println("The fcatorial of "+num+" using Recursion: "+factr);
		System.out.println("The fcatorial of "+num+" using Iteration: "+facti);
	}
	static int factRecursive(int n)
	{
		if(n==1) 
		{
			return 1;
		}
		return n*factRecursive(n-1);
	}
	static int factIterative(int n)
	{
		int f=1;
		for(int i=1;i<=n;i++)
		{
			f=f*i;
		}
		return f;
	}

}
