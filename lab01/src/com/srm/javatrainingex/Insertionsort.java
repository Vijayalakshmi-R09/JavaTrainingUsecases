package com.srm.javatrainingex;

import java.util.Scanner;

public class Insertionsort {

	static void insertSort(int[] arr, int n)
	{
		int temp, j,k;
		System.out.println("Array Elements After Insertion Sort");
		for(k=1; k<n; k++)   
	    {  
	        temp = arr[k];  
	        j= k-1;  
	        while(j>=0 && temp <= arr[j])  
	        {  
	            arr[j+1] = arr[j];   
	            j = j-1;  
	        }  
	        arr[j+1] = temp;  
	    }  
	    for(int i=0;i<n;i++)  
	    {  
	        System.out.println(arr[i]);  
	    }  
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Insertion Sort");
		System.out.println("Enter size of array: ");
		int n=sc.nextInt();
		int[] arr= new int[n];
		System.out.println("Enter array elements: ");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}  
       insertSort(arr,n);  
	}
}
