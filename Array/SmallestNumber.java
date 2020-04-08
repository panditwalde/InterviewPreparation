package com.Array;

import java.util.Scanner;

public class SmallestNumber {

	public static void main(String[] args) {
		 Scanner in=new Scanner(System.in);
			
			int a[]=new int[100];
			int n, small=0,ssmall=0 ,i,j;
			int k=3;
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
			System.out.print(a[i]+" ");
			  
			}
			
			for(i=0;i<n;i++)
			{ 
				for(j=i+1;j<n;j++)
				{
					if(a[i]>a[j])
					{
					   int tmp=a[i];
					   a[i]=a[j];
					   a[j]=tmp;
					
					}
					
				
				}
				if(i==k-1)
				{
	     
				  System.out.println(k+"  Smallest: "+a[i]);
				  break;
				}

				
			}
			
				} 

}
