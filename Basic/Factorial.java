package com.Basic;

import java.util.Scanner;

public class Factorial {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner in=new Scanner(System.in);
			
			
			int n,fact=1,i;;
			System.out.println("Enter the number");
			n=in.nextInt();
			/*for( i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			System.out.println("Factorial is "+fact+" !");*/
			
			System.out.println("Factorial is "+fact(n)+"!");
	}
	static int  fact(int n)
	{
		if(n==0 || n==1)
		{return 1;}
		else
		{ return n*fact(n-1);}
		
	}

}
