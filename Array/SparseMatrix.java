package com.Array;

import java.util.Scanner;

public class SparseMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int a[][]=new int[3][3];
		int i,j = 0,total=0;
		System.out.println("Enter the array element");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				a[i][j]=in.nextInt();
			}
		}
		System.out.println("Display the array element");
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println("");
		}
		if(total>=(i*j)/2)
		{
			System.out.println("This is sparse Matrix");
		}
		else
		{
			System.out.println("This is not sparse Matrix");
		}

	}

}
