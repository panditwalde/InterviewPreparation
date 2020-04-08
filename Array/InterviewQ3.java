package com.Array;

public class InterviewQ3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]= {1,2,3,4,6,2,1,9,0,5};
		int i,j,k;
		for(i=0;i<10;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if(a[i]+a[j]==5)
				{
					System.out.println(a[i]+"+"+a[j]);
				}
				else
				{
					if(a[i]+a[j]<5)
					for(k=j+1;k<10;k++)
					if(a[i]+a[j]+a[k]==5)
					System.out.println(a[i]+"+"+a[j]+"+"+a[k]);
				}
				
			}
		}

	}

}
