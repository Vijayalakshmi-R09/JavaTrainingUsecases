package com.srm.javatrainingex;

import java.util.Scanner;

public class Bubblesort {

	 static void bubbleSort(int[] arr) 
	 {
        int len= arr.length;  
        int temp = 0;  
         for(int i=0; i < len; i++)
         {  
             for(int j=1; j < (len-i); j++)
             {  
                  if(arr[j-1] > arr[j])
              {    
                     temp = arr[j-1];  
                     arr[j-1] = arr[j];  
                     arr[j] = temp;  
                 }     
             }  
         } 
	}

		public static void main(String[] args) 
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Bubble Sort");
			System.out.println("Enter size: ");
			int n=sc.nextInt();
			int[] arr= new int[n];
			System.out.println("Enter array elements: ");
			for(int i=0;i<n;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println("Array Elements are:");  
	        for(int i=0; i < arr.length; i++){  
	                System.out.print(arr[i] + " ");  
	        }  
	        System.out.println();  
	        bubbleSort(arr);  
	        
	        System.out.println("Array After Bubble Sort");  
	        for(int i=0; i < arr.length; i++){  
	                System.out.print(arr[i] + " ");  
	        }  


		}

	}