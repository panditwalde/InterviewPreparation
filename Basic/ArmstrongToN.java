package com.Basic;

public class ArmstrongToN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num,r,n,s=0;
		System.out.println("Armstrong number between 1 to 500");
		for(int i=1;i<=500;i++)
		{
			num=i;
			
			while(num>=0)
			{
				r=num% 10;
				  
				s=s+(r*r*r);
				num/=10;
			}
			if(s==i)
			{
				System.out.print(s+" ");
			}
			s=0;
		}
	}

}
