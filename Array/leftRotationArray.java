package com.Array;

import java.util.Arrays;

public class leftRotationArray {
	
	private static void leftRotation(int a[],int n)
	{
		System.out.println("Before Rotation Array");
		System.out.println(Arrays.toString(a));
		int tmp;
		for(int i=0;i<n;i++)
		{
			tmp=a[0];
			for(int j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
				
			}
			a[a.length-1]=tmp;
		}
		System.out.println();
		System.out.println("After  left Rotation By"+n+"Positions:");
		System.out.println(Arrays.toString(a));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		leftRotation(new int[] {1,2,3,4,6,7},2);
		
	

	}

}
