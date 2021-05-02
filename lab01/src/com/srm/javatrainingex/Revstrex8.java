package com.srm.javatrainingex;

import java.util.Scanner;

public class Revstrex8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.next();
        System.out.println("reversal of the given string: "+reverse(str));		
	}
	static String reverse(String s)
	{
		String rev="";
		for(int i=s.length();i>0;i--)
		{
			rev=rev+(s.charAt(i-1));
		}
		return rev;
	}
}
