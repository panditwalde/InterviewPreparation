package com.Array;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int a[]=new int[100];
		int n,i;
		System.out.println("Enter the array size");
		n=in.nextInt();
		System.out.println("Enter the array element");
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("Display the array element");
		for(i=0;i<n;i++)
		{ int sum=0;
				if(a[5]==5)	
				{
					sum+=a[i];
					
				}
				System.out.println(sum);
		}
		
		

	}

}
