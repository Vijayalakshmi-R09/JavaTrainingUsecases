package com.srm.javatrainingex;

import java.util.Scanner;

public class Armstrongnum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();
		checkArmstrong(num);		
	}
	static void checkArmstrong(int n)
	{
		int r=0,a,sum;
		sum=n;
		while(n>0)
		{
			a=n%10;
			n=n/10;
			r=r+(a*a*a);
		}
		if(sum==r)
		{
			System.out.println(sum+" --> Armstrong number.");
		}
		else
		{
			System.out.println(sum+" --> Not Armstrong number.");
		}
	}

}
