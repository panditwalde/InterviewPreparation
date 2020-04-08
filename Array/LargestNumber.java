package com.Array;

import java.util.Arrays;
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {

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
			System.out.print(a[i]+" ");
			  
			}
			
			for(i=0;i<n;i++)
			{ rank=0;
				for(j=0;j<n;j++)
				{
					if(a[i]>a[j])
					{
						rank++;
					}
				}
				if(rank==n-3)
				{
					System.out.println("3rd Largest Number:"+a[i]);
					break;
				}
			}
			
			int aa[]= {1,2,3,4,6,2,1,9,0,5};
             Arrays.sort(aa);
             System.out.println(aa.length);
             System.out.println("Smallest:"+aa[3]);
             System.out.println("Largest: "+aa[aa.length-4]);
	}

}
