package com.Basic;

import java.util.Scanner;


public class NumIntoWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		int n,num=0,digit;
		System.out.println("Enter the Number");
		n=in.nextInt();
		digit=(n);
		if(n<0)
		{System.out.println("enter number is negative");}
		else if(n>1000)
		{
			System.out.println("number is out of Range");
		}
		else
		{
		
		while(n!=0)
		{
			num=(num*10)+(n%10);
			n/=10;
		}
		digit-=num;
		while(num!=0)
		{
			switch(num%10)
			{
			
			case 0:System.out.print("Zero"+" ");break;
			case 1:System.out.print("One"+" ");break;
			case 2:System.out.print("Two"+" ");break;
			case 3:System.out.print("Three"+" ");break;
			case 4:System.out.print("Four"+" ");break;
			case 5:System.out.print("Five"+" ");break;
			case 6:System.out.print("Six"+" ");break;
			case 7:System.out.print("Seven"+" ");break;
			case 8:System.out.print("Eight"+" ");break;
			case 9:System.out.print("Nine"+" ");break;
			
			}
			num/=10;
		}
		while(digit==0)
		{
			System.out.print("Zero"+" ");
			digit--;
		}
		}

	}

}
