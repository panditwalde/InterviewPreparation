package com.Array;

import java.util.Scanner;

public class EvenOddInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int a[]=new int[100];
		int even[]=new int[100];

		int odd[]=new int[100];

		int n,i,e = 0,o = 0;
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
		
		
		for(i=0;i<n;i++)
		{
			if(a[i]%2==0)
			{
				even[i]=a[i];
				e++;
			}
			else
			{
				odd[i]=a[i];
				o++;
			}
		}
		System.out.println("Display Even Number ");
		for(i=1;i<=e;i++)
		{
			System.out.println(even[i]);
		}
		

		System.out.println("Display Odd Number ");
		for(i=1;i<=o;i++)
		{
			System.out.println(odd[i]);
		}
		


	}

}
