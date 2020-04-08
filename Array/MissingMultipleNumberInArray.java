 package com.Array;

public class MissingMultipleNumberInArray {
	
	  public static   int  getmiss(int a[],int first,int last)
	   { 
		  int i,j;
		  for(i=first;i<a[0];i++)
		  {
			  System.out.print(" "+i);
			  
		  }
		  for(i=1;i<a.length;i++)
		  {
			  for(j=1+a[i-1];j<a[i];j++)
			  {
				  System.out.print(" "+j);
			  }
			  
		  }
		  for(i=1+a[a.length-1];i<last;i++)
		  {
			  System.out.print(" "+i);
		  }
		  return 1;

	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {0,1,2,3,4,7,8,9,10,11,12,13,17,23};		
		System.out.println("Display the array element");
		for( int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
			
		}
		System.out.println();
		System.out.println("Missing number");
		
	int miss=getmiss(a,0,24);
	
			
					

	}

}
