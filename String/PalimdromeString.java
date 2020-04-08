package com.String;

import java.util.Scanner;

public class PalimdromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Scanner in= new Scanner(System.in);
		String n;
		int i;
		System.out.println("Enter the String");
		n=in.nextLine();
		
		char[] ch=n.toCharArray();
		int c=0;
		for(i=0;i<ch.length/2;i++)
		{
			if(ch[i]==ch[ch.length-1-i])
			{
				c++;
				continue;
			}
			else
			{
				c=0;
				System.out.println("This is not palimdrome String");
			}
		}
			
		
		
		
		if(c>0)
		{
			System.out.println("This is Palimdrome String");
		}*/
		
		
		/*String word="";
		String reverse="";
		for(int i=word.length()-1;i>=0;i--)
		{
			reverse+=word.charAt(i);
			
		}
		System.out.println("Reverse Word: "+reverse);

		if(word.equals(reverse))
		{
			System.out.println("This is Palimdrome String");
		}
		else
		{
			System.out.println("This is  not Palimdrome String");
		}*/
		String str="aaaaaaaaad";
		char[] word=str.toCharArray();
		
		int len = 0;
		
		for(char c:word)
		{
			len++;
		}
         
         int i;
         int end=len-1;
         
         for( i=0;i<len/2;i++)
         {
        	 if(word[i]!=word[end])
        	 {
        		 System.out.println("String is not palimdrome ");
        		 break;
        	 }end--;
         }
         if(i==len/2)
         {
        	 System.out.println("String is palimdrome ");
         }

	}

}
