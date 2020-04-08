package com.Array;

import java.util.Scanner;

public class DisplayRepeatNumberInArray {
	public static void main(String x[])

	{
	Scanner in= new Scanner(System.in);
    int 	a[]=new int[10];
    int n, i ,j, k,found=0,position=0;
    System.out.println("Enter the arrray size..");
    n=in.nextInt();
    for(i=0;i<n;i++)
    {
    	a[i]=in.nextInt();
    }
    System.out.println("Display the Array element");
    for(i=0;i<n;i++)
    {
    	System.out.print(a[i]+" ");
    }
    System.out.println();
    System.out.println("Enter the which number you want delete in array");
    int pos=in.nextInt();
	
	
	for(i=0;i<n;i++)
	{
		/*for(j=i+1;j<n;j++)
		{
		   if(a[i]==a[j])
		   {
			   for(k=j;k<n;k++)
			   {
				   a[k]=a[k+1];
			   }
			   n--;
			   j--;
		   }
		   
		}*/
		if(a[i]==pos)
		{
			found=1;
			position=i;
			break;
		}
	}
	if(found==1)
	{
		for(i=position;i<n-1;i++)
		{
			a[i]=a[i+1];
		}
		
	}
	else {
		System.out.println("Number is found array");
		
	}
	System.out.println("Display Duplicate remove the Array element");
    for(i=0;i<n-1;i++)
    {
    	System.out.print(a[i]+" ");
    }

	}
}
