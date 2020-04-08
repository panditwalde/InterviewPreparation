package com.Array;

import java.util.HashSet;
import java.util.Scanner;

public class DulicateElementArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String[] strArray = {"Java", "JSP", "Servlets","Servlets", "Java", "Struts", "JSP", "JDBC"};
		  
        /*for (int i = 0; i < strArray.length-1; i++)
        {
            for (int j = i+1; j < strArray.length; j++)
            {
                if( (strArray[i].equals(strArray[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+strArray[j]);
                }
            }
        }
*/
		 /*HashSet <String> h= new HashSet<String>();
		  for(String s:strArray)
		  {
			  if(!h.add(s))
			  {
				  System.out.println("duplicate Element: "+s);
			  }
		  }
	*/  Scanner in=new Scanner(System.in);
	
	int a[]=new int[100];
	int n,total, sum=0 ,i,j,k;
	System.out.println("Enter the array size");
	n=in.nextInt();
	System.out.println("Enter the array element");
	for(i=0;i<n;i++)
	{
		a[i]=in.nextInt();
	}
	System.out.println("Display the array element");
	for(i=0;i<n;i++)
	{
	System.out.println(a[i]);
	  
	}
	
	   for(i=0;i<n;i++)
	   {
		    for(j=i+1;j<n;j++)
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
		    	
		    }
	   }
	
	   
	   System.out.println("Remove dulicate  the array element");
		for(i=0;i<n;i++)
		{
		System.out.print(a[i]);
		  
		}
	
		}

}
