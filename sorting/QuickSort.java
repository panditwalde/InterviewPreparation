package com.sorting;

import java.util.Scanner;

public class QuickSort {
	
	public static void quicksort(int a[],int first,int last)
	{
		 int i,j,pivot,temp;
		 
		 if(first<last)
		 {
			 pivot=first;
			 i=first;
			 j=last;
			 while(i<j)
			 {
				 while(a[i]<=a[pivot]&&i<last) {i++;}
				 while(a[j]>a[pivot]) {j--;}
				 if(i<j) {
					 temp=a[i];
					 a[i]=a[j];
					 a[j]=temp;
				 }
			 }
			 
			 temp=a[pivot];
			 a[pivot]=a[j];
			 a[j]=temp;
			 quicksort(a,first,j-1);
			 quicksort(a,j+1,last);
		 }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in =new Scanner(System.in);
		int i, n;
		int a[]= new int[100];
		
		System.out.println("Enter the array size");
		n=in.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		
		quicksort(a,0,n-1);
		
		System.out.println("Order of sorted elements");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
