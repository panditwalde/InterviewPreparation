package com.Basic;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.SynchronousQueue;

public class RepeatOneLoop {
	
	public static void duplicate(int a[],int n)
	{
		int i;
		System.out.println("Repeating element in array");
		
		for(i=0;i<n;i++)
		{
			if(a[Math.abs(a[i])]>=0)
			{
				System.out.print(a[Math.abs(a[i])]=-a[Math.abs(a[i])]);
			}
			else
			{
				System.out.print(Math.abs(a[i])+" ");
			}
			
		}
	}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int a[]= {1, 2, 3, 1, 3, 6, 6,2,8,8,3,4};
		
          HashSet set= new HashSet();
          for(int i=0;i<a.length;i++)
          {
        	  set.add(a[i]);
          }
		
          System.out.println("duplicate Number "+ set );
		int arsize=a.length;
		duplicate(a,arsize);

	}

}
 