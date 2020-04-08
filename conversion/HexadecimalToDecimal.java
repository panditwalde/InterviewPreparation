package com.conversion;

public class HexadecimalToDecimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		String hex="5BAB";
		int dec=0,x=1;
		for(int i=hex.length()-1;i>=0;i--)
		{
			int tmp=process(hex.charAt(i));
			dec=dec+(tmp*x);
			x=x*16;
		}
		System.out.println("decimal values is: "+dec);

	}
	private static int process(char ch)
	{
		int num=0;
		if(ch>=65&& ch<=70)
		{
			num=(int)ch-55;
		}
		else
		{
			num=(int)ch-48;
		}
		
		return num;
		
	}


	}


