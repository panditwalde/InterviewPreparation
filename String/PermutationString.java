package com.String;
public class PermutationString {
	
	static public   void Permutation(String input)
	{
		Permutation("" ,input);
		
	}
	private  static void Permutation(String per,String input)
	{
		if(input.length()==0)
		{
			System.out.print(" "+per);
		}
		for(int i=0;i<input.length();i++)
		{
			Permutation(per+input.charAt(i),input.substring(0, i)+input.substring(i+1,input.length()));
		}
	}
	public static void main(String[] args) {
		
		Permutation("123");
		
	}

}
  