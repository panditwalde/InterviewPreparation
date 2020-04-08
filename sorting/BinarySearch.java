package com.sorting;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in= new Scanner(System.in);
		int a[]= new int[100];
		int n,c,search,first,last,middle, flag=0;
		System.out.println("Enter the array size");
		n=in.nextInt();
		System.out.println("Enter the array element");
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		System.out.println("Enter the serach number");
		search=in.nextInt();
		
		first=0;
		last=n-1;
		middle=(first+last)/2;
		
		while(first<last)
		{
			if(search==a[middle])
			{
				flag=1;
				break;
			}
			else
			{
				
				if(search>a[middle])
				{
					first=middle+1;
				}
				else
				{
					last=middle-1;
				}
			}
		}
		if(flag==1)
		{
			System.out.println("Element found at Position "+(middle+1));
		}
		else
		{
			System.out.println("Element not found");
		}

	}

}
