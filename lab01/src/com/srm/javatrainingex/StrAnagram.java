package com.srm.javatrainingex;

import java.util.Arrays;
import java.util.Scanner;

public class StrAnagram {
	static void isAnagram(String string1, String string2) {  
        String str1 = string1.replaceAll("\\s", "");  
        String str2 = string2.replaceAll("\\s", "");  
        boolean val = true;  
        if (str1.length() != str2.length()) 
        {  
            val = false;  
        } 
        else 
        {  
            char[] arr1 = str1.toLowerCase().toCharArray();  
            char[] arr2 = str2.toLowerCase().toCharArray();  
            Arrays.sort(arr1);  
            Arrays.sort(arr2);  
            val = Arrays.equals(arr1, arr2);  
        }  
        if (val) {  
            System.out.println(str1 + " and " + str2 + " are anagrams");  
        } else {  
            System.out.println(str1 + " and " + str2 + " are not anagrams");  
        }  
    }  
   
  
	public static void main(String[] args) 
	{
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter string 1: ");
         String s1=sc.next();
         System.out.println("Enter string 2: ");
         String s2=sc.next();
		 isAnagram(s1,s2);  
	     isAnagram("I am alone", "I am fine");  
	}

}
