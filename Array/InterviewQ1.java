package com.Array;

public class InterviewQ1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,0,-1,-2,4,-10,2,-4,-2,9};
		int k=0,i=0,l=10;
		for(i=0;i<l;i++)
		{
			if(a[i]<0)
			k++;
			if(a[i]>0 && k>0)
			for(int j=i;j>i-k;j--)
			{
				int tmp=a[j];
				a[j]=a[j-1];
				a [j-1]=tmp;
				
			}
			
			
			
		}
		for(i=0;i<l;i++)
		{
			System.out.print(a[i]+" ");
		}
	}

}
