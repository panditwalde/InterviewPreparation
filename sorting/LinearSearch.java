package com.sorting;

import java.util.Scanner;

public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int a[]= new int[100];
		int n,c,search;
		System.out.println("Enter the array size");
		n=in.nextInt();
		System.out.println("Enter the array element");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("Enter the serach number");
		search=in.nextInt();
		
		for(int i=0;i<n;i++)
		{
			if(a[i]==search)
			{
				System.out.println(search +" is present at location  "+(i+1));
				break;
			}
			if(i==n)
			{System.out.println(search +"is not  present in array ");}
		}
		
		
	}

}
