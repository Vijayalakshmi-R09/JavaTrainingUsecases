package com.srm.javatrainingex;

import java.util.Scanner;

public class Addofmatrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.println("Matrix 1\nEnter the number of rows: ");
        int r = sc.nextInt();
        System.out.println("Enter the number columns: ");
        int c = sc.nextInt();
        int m1[][] = new int[r][c];
        System.out.println("Enter the elements of the matrix");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                m1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix 2\nEnter the number of rows: ");
        int r1 = sc.nextInt();
        System.out.println("Enter the number columns: ");
        int c1 = sc.nextInt();
        int m2[][] = new int[r1][c1];
        System.out.println("Enter the elements of the matrix");
        for(int i = 0; i < r; i++)
        {
            for(int j = 0; j < c; j++)
            {
                m2[i][j] = sc.nextInt();
            }
        }

        System.out.println("Elements of the Matrix 1 :");
        for (int i = 0; i < r; i++) 
        {
            for (int j = 0; j < c; j++)
            {
                System.out.print(m1[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Elements of the Matrix 2 :");
        for (int i = 0; i < r1; i++) 
        {
            for (int j = 0; j < c1; j++)
            {
                System.out.print(m2[i][j] + "  ");
            }
            System.out.println();
        }
        int m3[][]=new int[r][c];     
        for(int i=0;i<r;i++)
        {    
        	for(int j=0;j<c;j++)
        	{    
        		m3[i][j]=m1[i][j]+m2[i][j];    
        		System.out.print(m3[i][j]+" ");    
        	}    
        	System.out.println();
        }
	}
}
