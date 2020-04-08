package com.Basic;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n, sum=0,r,tmp,a;
		System.out.println("Enter the  any number");
		n=in.nextInt();
		
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum+=i;
				
			}
		}
		if(sum==n)
		{ 
			System.out.println("No is  perfect");
			
		}else
		{
			System.out.println("No is Not perfect");
		}

	}

}
