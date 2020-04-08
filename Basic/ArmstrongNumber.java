package com.Basic;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n, sum=0,r,tmp,a;
		System.out.println("Enter the  any number");
		n=in.nextInt();
		tmp=n;
		while(n>0)
		{
			r=n%10;
			a=r*r*r;
			sum=sum+a;
			n/=10;
		}
		if(tmp==sum)
		{
			System.out.println("This is number  Armstrong number");
		}
		else
		{
			System.out.println("This is number not  Armstrong number");
		}

	}

}
