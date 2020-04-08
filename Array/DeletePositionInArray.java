package com.Array;

import java.util.Scanner;

public class DeletePositionInArray {

	public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
		int a[]=new int[100];
		int n,total, sum=0 ,i,pos;
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
		  
		}
		System.out.println("Enter the position you want...");
		  pos=in.nextInt();
		
		if(pos>=n+1)
		{
			System.out.println("Deletion Not possible ....");
			
		}
		else
		{
			
			for(i=pos-1;i<n-1;i++)
			{
				a[i]=a[i+1];
			}
		}
		System.out.println(" after delection Display the array element");
		for(i=0;i<n-1;i++)
		{
		System.out.println(a[i]);
		  
		}
		
		
		
		

	}

}
