package com.Array;

import java.util.Arrays;

public class RightRotation {

	private static void RightRotation(int a[],int n)
	{
		System.out.println("Before Rotation Array");
		System.out.println(Arrays.toString(a));
		int j,last;
		
		for(int i=0;i<n;i++)
		{
			last=a[a.length-1];
			
			for( j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
				
			}
			a[0]=last;
		}
		System.out.println();
		System.out.println("After  Right Rotation By"+ n +"Positions:");
		System.out.println(Arrays.toString(a));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		RightRotation(new int[] {1,2,3,4,6,7},3);
	}


}
