package com.Basic;

public class WithoutUsingThirdVariable {

	public static void main(String[] args) {
		int a=10,b=20;
		
		
		System.out.println("a= "+ a+ "b= "+ b);
		
		
		
		//process one
	   /* a=b+a;
	    b=a-b;
	    a=a-b;
	    */

	    //process two
	    a=a+b-(a=b);
	   
		System.out.println("After Swapping Number");
		System.out.println("a= "+ a+ "b= "+ b);
		// TODO Auto-generated method stub

	}

}
