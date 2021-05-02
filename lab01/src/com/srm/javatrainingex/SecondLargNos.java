package com.srm.javatrainingex;

import java.util.Scanner;

public class SecondLargNos {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array");
		int s=sc.nextInt();
		int arr1[]=new int[s];
		System.out.println("Enter the elements:");
		for(int i=0;i<s;i++) {
			arr1[i]=sc.nextInt();
		}
		System.out.println("Array elements are: ");  
		for (int i=0; i<s; i++)   
		{  
			System.out.print(arr1[i]+" ");  
		}  
		System.out.println("\nSecond Largest Element: "+secondLargest(arr1,s));  
	
	}
		public static int secondLargest(int arr1[],int l) 
		{
			int sum;
			for(int i=0;i<l;i++) {
				for(int j=i+1;j<l;j++) {
					if(arr1[i]>arr1[j])
					{
						sum=arr1[i];
						arr1[i]=arr1[j];
						arr1[j]=sum;
					}
				}
			}
			return arr1[l-2];
		}

}
