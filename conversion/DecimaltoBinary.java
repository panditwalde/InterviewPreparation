package com.conversion;

public class DecimaltoBinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=12;
		String str="";
		
		while(num>0)
		{
			int rem=num%2;
			str=rem+str;
			num/=2;
		}
		System.out.println("Binary value is "+str);

	}

}
