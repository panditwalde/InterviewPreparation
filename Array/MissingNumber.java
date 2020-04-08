package com.Array;

import java.util.Scanner;

public class MissingNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		
		int a[]=new int[100];
		int n,total, sum=0 ,i;
		System.out.println("Enter the array size");
		n=in.nextInt();
		System.out.println("Enter the array element");
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("Display the array element");
		for(i=0;i<n;i++)
		{
		System.out.println(a[i]);
		  sum+=a[i];
		}
		
		total=(n+1)*(n+2)/2;
		
		System.out.println("Missing number:- "+(total-sum));
		
		
		
		

	}

}
