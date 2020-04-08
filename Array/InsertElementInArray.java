package com.Array;

import java.util.Scanner;

public class InsertElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=new Scanner(System.in);
			
			int a[]=new int[100];
			int n,total, sum=0 ,i,j,rank;
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
			int position,value;
			System.out.println("Enter the position in array");
			position=in.nextInt();
			System.out.println("Enter the value in array");
			value=in.nextInt();
			
			
			for(i=n-1;i>position-1;i--)
			{
				a[i+1]=a[i];
				
			}
			a[position-1]=value;
			System.out.println("After inserting the array element");
			for(i=0;i<=n;i++)
			{
			System.out.println(a[i]);
			  
			}
	}

}
