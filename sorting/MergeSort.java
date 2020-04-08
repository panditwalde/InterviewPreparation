package com.sorting;

import java.util.Scanner;

public class MergeSort {
	
	public static void  merge(int list[],int low,int mid, int high)
	{
		
		int i,mi,k,lo;
		int  tmp[]=new int[49];
		
		lo=low;
		i=low;
		mi=mid+1;
		while(lo<mid && mi<=high)
		{
			if(list[lo]<=list[mi])
			{
				tmp[i]=list[lo];
				lo++;
			}
			else
			{
				tmp[i]=list[mi];
				mi++;
			}
			i++;
		}
		if(lo>mid)
		{
			for(k=mi;k<=high;k++)
			{
				tmp[i]=list[k];
				i++;
			}
			
		}
		else
		{
			for(k=lo;k<=mid;k++)
			{
				tmp[i]=list[k];
				i++;
			}
		}
		for(k=low;k<=high;k++)
		{
			list[k]=tmp[k];
		}
		
	}
	 public static void  partition(int list[], int low, int high)
	 {
		 int mid;
		 if(low!=high)
		 {
			 mid=low+high/2;
			 partition(list
					 ,low,mid);
			 partition(list,mid+1,high);
			 merge(list,low,mid,high);
			 
		 }
		 
	 }
	

	public static void main(String[] args) {

		
		Scanner in =new Scanner(System.in);
		int i, n;
		int a[]= new int[100];
		
		System.out.println("Enter the array size");
		n=in.nextInt();
		for(i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		
		partition(a,0,n-1);
		
		System.out.println("Order of sorted elements");
		for(i=0;i<n;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
