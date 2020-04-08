package com.Basic;
class LargestBetweenThreeN
{
  public static void main(String[] args) {
	
	  
	  int a=4,b=3332,c=343;
	  
	    if(a>b && a>c) { System.out.println("A is largest Number");}
	    if(b>a && b>c) { System.out.println("B is largest Number");}
	    if(c>a && c>b) { System.out.println("c is largest Number");}
	    
	    if(a>b)
	    {
	    	if(a>c)
	    	{ 
	    		System.out.println("A is largest Number");
	    		}
	    	else
	    	{
	    		{ System.out.println("C is largest Number");}
	    	}
	    		
	    }
	    else
	    {
	    	if(b>c)
	    	{
	    		 System.out.println("B is largest Number");	
	    	}
	    	else
	    	{
	    		 System.out.println("C is largest Number");
	    	}
	    }
	   
}	
}
