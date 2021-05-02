package com.srm.javatrainingex;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str=s.nextLine();
		if(str.isEmpty()) {
			System.out.println("Empty string.\nPlease Enter a valid String...");
			String str1=s.nextLine();
			checkPalindrome(str1);
		}
		else 
		{
			checkPalindrome(str);
	    }
	}
	static void checkPalindrome(String s) 
	{
			String s1="";
			int l=s.length();
			for(int i=l-1;i>=0;i--) 
			{
				s1=s1+s.charAt(i);
		    }
		if(s.equals(s1))
		{
			System.out.println(s+" is a Palindrome");
		}
		else
		{
			System.out.println(s+" is not a Palindrome");
		}
    }
}
