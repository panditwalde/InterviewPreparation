package com.sorting;

import java.util.Scanner;

public class SelectionSort {
	
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
			int loc;
			
			
			for(i=0;i<n-1;i++)
			{
				loc=i;
				
				for(int j=i+1;j<n;j++)
				{
					if(a[loc]>a[j])
					{
						loc=j;
					}
				}
					
					int tmp;
					if(loc!=i)
					{
						
						tmp=a[i];
						a[i]=a[loc];
						a[loc]=tmp;
						
					}
				
			}
			
			System.out.println("Display the array Asecnding order element");
			for(i=0;i<n;i++)
			{
			System.out.println(a[i]);
			  
			}
		
	}

}
