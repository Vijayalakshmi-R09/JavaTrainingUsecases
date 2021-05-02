package com.srm.javatrainingex;

import java.util.Scanner;

public class Swapex10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the values: \nNum1:");
		int num1=sc.nextInt();
		System.out.println("Num2:");
		int num2=sc.nextInt();
		System.out.println("Values before SWAP Num1: "+num1+" Num2: "+num2);
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
		System.out.println("Values After SWAP Num1: "+num1+" Num2: "+num2);
	}
}
