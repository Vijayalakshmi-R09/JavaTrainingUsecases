package com.srm.javatrainingex;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n=s.nextInt();
		primeNo(n);
	}
	
		static void primeNo(int n)
		{
			int f=0;
			boolean a=true;
			f=n/2;
			if(n==0||n==1) 
			{
				System.out.println(n+" is not a Prime Number");
			}
			else
			{
				for(int i=2;i<=f;i++) 
				{
					if(n%i==0) 
					{
						System.out.println(n+"is not a Prime Number");
						a=false;
						break;
					}
				}
				if(a) {
					System.out.println(n+" ia a Prime Number");
				}
			}

	}

}
