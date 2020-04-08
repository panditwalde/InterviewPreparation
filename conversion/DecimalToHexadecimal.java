package com.conversion;

public class DecimalToHexadecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=23467;
		String hex="";
		while(num>0)
		{
			int rem= num%16;
			hex=(process(rem))+hex;
			num/=16;
			
		}
		System.out.println("Hexadecimal values is: "+hex);

	}
	private static String process(int num)
	{
		String tmp="";
		if(num>=0 && num<=9)
		{
			tmp=tmp+num;
		}
		else
		{
			tmp=tmp+(char)(num+55);
		}
		
		return tmp;
		
	}

}
