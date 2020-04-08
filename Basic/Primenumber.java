package com.Basic;

import java.util.Scanner;

public class Primenumber {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n,i,sum=0,start,end,isprime;
		System.out.println("Enter lower limit:");
		start=in.nextInt();
		System.out.println("Enter upper  limit:");
		end =in.nextInt();
		  for(i= start;i<=end;i++)
		  {
			  isprime=1; 
		  
		for( int j=2;j<=i/2;j++)
		{
			if(i%j==0)
			{
				isprime=0;
				break;
				
			}
			
			
		}
		if(isprime==1)
		{
			sum+=i; 
		}
		
		  }
		  System.out.printf("Sum of all prime numbers between %d to %d = %d", start, end, sum);
		  
			
	}

}
