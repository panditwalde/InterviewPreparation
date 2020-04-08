package com.conversion;

public class DecimaltoOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num=3434;
		 String oct="";
		
		while(num>0)
		{
			int rem=(int)num%8;
			 oct=rem+oct;
			 
			num/=8;
		}
		System.out.println("Octal values is "+oct);

	}

}
