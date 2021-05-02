package com.srm.javatrainingex;

import java.util.Scanner;

public class Whitspaceremov {

	public static void main(String[] args) 
	{

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string : ");
        String str=sc.nextLine();
        System.out.println("Original string:  "+str);
        String str2;
		str2 = str.replaceAll("\\s", ""); 
		System.out.println("After whitespace removal:  "+str2);
	}
}
