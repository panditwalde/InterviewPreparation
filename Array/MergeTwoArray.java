package com.Array;

import java.util.Scanner;

public class MergeTwoArray {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int a[]= {1,2,3,4,7,8,9,0};
		int b[]= {47,89};
		int c1=a.length+b.length;
		int c[]=new int[c1];

		int i;
		System.out.println("Display Second array element");
				for(i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		  
		}

		
				System.out.println("Display Second array element");
		for(i=0;i<b.length;i++)
		{
		System.out.println(a[i]);
		  
		}
		
		System.out.println("Display Merge two Array");
		
         for(i=0;i<a.length;i++)
         {
        		 c[i]=a[i];
         }
         for(i=0;i<b.length;i++)
         {
        		 c[a.length+i]=a[i];
         }
         for(i=0;i<c.length;i++)
         {
             System.out.print(c[i]+" ");
         }
	}

}
