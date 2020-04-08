package com.Array;

import java.util.Scanner;

public class DeleteArrayValue {

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
			System.out.println("Enter the position you want...");
			  pos=in.nextInt();
			
         for(i=0;i<n;i++)
         {
        	 if(a[i]==pos)
        	 {
        		 found=1;
        		 position=i;
        		 break;
        	 }
         }
         if(found==1)
         {
        	 for(i=position;i<n-1;i++)
        	 {
        		 a[i]=a[i+1];
        	 }
        	 
         }
         else
         {
        	 System.out.println("Number is not found");
         }
         System.out.println("array after deletion of the  element");
         for(i=0;i<n-1;i++)
         {
        	 System.out.println(a[i]);
         }
	}

}
