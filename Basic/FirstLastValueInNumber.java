package com.Basic;

import java.util.Scanner;

public class FirstLastValueInNumber {

	public static void main(String[] args) {
	
		Scanner in= new Scanner(System.in);
		int n,f = 0,l = 0,b;
		System.out.println("Enter the any number");
		n=in.nextInt();
		f=n%10;
		do
		
		{
			
			b=n%10;
			n=n/10;
			
		}while(n!=0);
		System.out.println("First "+b);
		System.out.println("Last  "+f);
	}

}
