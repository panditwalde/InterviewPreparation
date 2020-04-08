package com.Array;

import java.util.Scanner;

public class InterviewQ4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner in=new Scanner(System.in);
			int a[][]=new int[100][100];
			int m,n,found=0,j, position = 0 ,i,pos;
			System.out.println("Enter the array row & column");
			m=in.nextInt();
			n=in.nextInt();
			System.out.println("Enter the array element");
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					a[i][j]=in.nextInt();
					
				}
				
			}
			System.out.println("Display the array element");
			for(i=0;i<m;i++)
			{
				for(j=0;j<n;j++)
				{
					System.out.print(a[i][j]+" ");
					  
					
				}
				System.out.println("");
				
			}
			
			System.out.println("Enter index");
			  pos=in.nextInt();
			  
			  for(i=0;i<m;i++)
				{
					for(j=0;j<n;j++)
					{
						if(a[i][j]==pos)
						{
							for(i=0;i<n;i++)
							{
								a[i][j]=0;
							}
						}
						
					}
					
				}
			  for(i=0;i<m;i++)
				{
					for(j=0;j<n;j++)
					{
						System.out.print(a[i][j]+" ");
						  
						
					}
					System.out.println("");
					
				}

	}

}
