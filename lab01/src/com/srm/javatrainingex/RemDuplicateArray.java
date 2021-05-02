package com.srm.javatrainingex;

import java.util.Arrays;
import java.util.Scanner;

public class RemDuplicateArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array: ");
		int n=sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++) 
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int l=arr.length;  
		l=removeDuplicate(arr,l);
		System.out.println("\nArray after removing duplications ");
		for (int i=0; i<l; i++)  
		{
	           System.out.print(arr[i]+" ");  
		}
}
	public static int removeDuplicate(int arr[],int l)
	{
        int t[] =new int[l];
        int j=0;
        for (int i = 0; i < l-1; i++) 
        {
           if (arr[i] != arr[i+1])
           {
               t[j++]=arr[i];
           }
        }
        t[j++] = arr[l-1];     
        for (int i=0; i<j; i++)
        {  
            arr[i] = t[i];  
        }   
        return j; 
	}
}
