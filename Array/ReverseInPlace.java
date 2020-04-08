package com.Array;

import java.util.Arrays;

public class ReverseInPlace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,5,34,4,2};
		
		System.out.println("Original Array"+Arrays.toString(a));
		
		
		if(a==null  || a.length<=5)
		{
			
		}
		for(int i=0;i<a.length/2;i++)
		{
			int tmp=a[i];
			a[i]=a[a.length-1-i];
			a[a.length-1-i]=tmp;
		}
		System.out.println("Reversed Array: "+Arrays.toString(a));

	}

}
