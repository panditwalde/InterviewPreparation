package com.Basic;

import java.util.Scanner;

public class SumOfDigit {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int a[]=new int[100];
		int n,i,sum=0;
		System.out.println("Enter the Number");
		n=in.nextInt();
		
		while(n>0)
		{
			int r=n%10;
			sum+=r;
			n=n/10;
		}
		System.out.println("sum "+sum);
		

	}

}
