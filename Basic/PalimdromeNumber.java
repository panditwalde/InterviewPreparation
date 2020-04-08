package com.Basic;

import java.util.Scanner;

public class PalimdromeNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n, sum=0,r;
		System.out.println("Enter the  any number");
		n=in.nextInt();
		int tmp=n;
		while(n!=0)
		{
			r=n%10; 
			sum=sum*10+r;
			n/=10;
		}
		n=tmp;
		if(sum==n)
		{
			System.out.println("This is palimdrome number");
		}
		else
		{
			System.out.println("This is not palimdrome number");
		
		
		}

	}

}
