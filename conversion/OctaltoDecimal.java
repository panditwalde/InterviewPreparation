package com.conversion;

public class OctaltoDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=6731;
		 int dec=0,x=1;
		 
		
		while(num>0)
		{
			int rem=num%10;
			 dec=dec+(rem*x);
			
			num/=10;
			 x*=8;
		}
		System.out.println("Decimal value is "+dec);


	}

}
