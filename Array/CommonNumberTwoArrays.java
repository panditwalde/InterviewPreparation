package com.Array;

import java.util.Scanner;

public class CommonNumberTwoArrays {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		
		int a[]= {1,2,3,4,7,8,47};
		int b[]= {1,2,3,4,7,9,44};
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(  " "+a[i]);
				}
					
			}
		}
		
	
	}
	
}
