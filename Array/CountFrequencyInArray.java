package com.Array;

import java.util.Scanner;

public class CountFrequencyInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int a[]= new int[100];
		int b[]= new int[100];
		int n,i,j,ctr;
		
		System.out.println("Enter the array size");
		n=in.nextInt();
		System.out.println("Enter the array element");
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			b[i]=-1;
		}
		for(i=0;i<n;i++)
		{
			ctr=1;
			for(j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					ctr++;
					b[j]=0;
				}
			}
			
			if(b[i]!=0)
			{
		       b[i]=ctr;
			}
		}
		
		
		
		
		System.out.println("Frequency of all element");
		for(i=0;i<n;i++)
		{
			if(b[i]!=0)
			{
		       System.out.println(a[i]+" :"+b[i]);
			}
		}


	}

}
