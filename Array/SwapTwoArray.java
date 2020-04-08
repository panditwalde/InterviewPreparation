package com.Array;

import java.util.Scanner;

public class SwapTwoArray {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i,n;
		int a[]=new int[100];
		int b[]=new int[100];
		int c[]=new int[100];
		
		 System.out.println("Enter the array size");
		 n=in.nextInt();
		 System.out.println("Enter the first array element");
		 for(i=0;i<n;i++)
		 {
			a[i]=in.nextInt(); 
		 }
		 System.out.println("Enter the Second array element");
		 for(i=0;i<n;i++)
		 {
			b[i]=in.nextInt(); 
		 }
		 System.out.println("Display the first array element");
		 for(i=0;i<n;i++)
		 {
			 System.out.println(a[i]); 
		 }
		 System.out.println("Display the Second array element");
		 for(i=0;i<n;i++)
		 {
			 System.out.println(b[i]);
		 }
		 for(i=0;i<n;i++){
	            //write any swapping technique
	            c[i]=a[i];
	            a[i]=b[i];
	            b[i]=c[i];
	  }
		 System.out.println("\nArrays after swapping");
		 for(i=0;i<n;i++)
		 {
			 
		 }
		 System.out.println("First array->");
		 for(i=0;i<n;i++)
		 {
			 System.out.println(a[i]);
		 }
		 System.out.println("Second array->");
		 for(i=0;i<n;i++)
		 {
			 System.out.println(b[i]);
		 }
	 
	  
		// TODO Auto-generated method stub

	}

}
