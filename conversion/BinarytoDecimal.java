package com.conversion;

public class BinarytoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num=10011110000d;
		 int x=1;
		 double n = 0;
		
		while(num>0)
		{
			int rem=(int)num%10;
			 n=n+(rem*x);
			 x*=2;
			num/=2;
		}
		System.out.println("Decimal value is "+n);

	}


	

}
