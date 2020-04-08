package com.sorting;

import java.util.Scanner;

public class BubbleSort {
	
	
	public static void main(String[] args) {
		
		 Scanner in=new Scanner(System.in);
			int a[]=new int[100];
			int n,found=0, position = 0 ,i,pos;
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
			
			
			for(i=0;i<n-1;i++)
			{
				
				for(int j=0;j<n-i-1;j++)
				{
					
					int tmp;
					if(a[j]>a[j+1])
					{
						
						tmp=a[j];
						a[j]=a[j+1];
						a[j+1]=tmp;
						
					}
				}
			}
			
			System.out.println("Display the array Asecnding order element");
			for(i=0;i<n;i++)
			{
			System.out.println(a[i]);
			  
			}
		
	}

}
