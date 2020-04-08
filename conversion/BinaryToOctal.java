package com.conversion;

public class BinaryToOctal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int bin=101001;
		String oct="";
		while(bin>0)
		{
			int val= process(bin%1000);
			oct=val+oct;
			bin/=1000;
			
		}
		System.out.println("octal values is: "+oct);

	}
	private static int process(int num)
	{
		int res=0,x=1;
		while(num>0)
		{
			int rem=num%10;
			res=res=(rem*x);
			x=x*2;
			num/=10;
		}
		
		return res;
		
	}

	}


