package com.srm.javatrainingex;

import java.util.Scanner;

public class Reversestrex9 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.next();
        String rev="";
        for(int i=str.length();i>0;i--) 
        {
        	rev=rev+(str.charAt(i-1));
        }
        System.out.println("The Reversed string: "+rev);
	}
}
