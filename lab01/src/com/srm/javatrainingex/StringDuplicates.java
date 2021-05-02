package com.srm.javatrainingex;

import java.util.Scanner;

public class StringDuplicates {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.next();
        char[] s=str.toCharArray();
        int temp=1;
        for(int i=0;i<s.length;i++) 
        {
        	for(int j=i+1;j<s.length;j++)
        	{
        		if(s[i]==s[j]) {
        			System.out.println(s[i]);  
        			temp++;
        			break;
        		}
        	}
        }
    	if(temp==1) 
		{
			System.out.println("No Duplicates..");
        }
    }
}

