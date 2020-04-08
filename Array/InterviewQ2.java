package com.Array;

public class InterviewQ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,9},{8,3,4},{7,6,5}};
		int i=0,j=0,tmp;
		for(i=0;i<3;i++)
		{
			for(j=0;j<3;j++)
				
			{
				while(a[i][j]-1!=((i+3)+j))
				{
					tmp=a[i][j];
					a[i][j]=a[tmp/3][tmp%3-1];
					a[tmp/3][tmp%3-1]=tmp;
				}
				System.out.print(a[i][j]+" ");
			}
			
		}

	}

}
