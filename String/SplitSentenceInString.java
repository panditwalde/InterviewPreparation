package com.String;

public class SplitSentenceInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="Panditwalde0";
		System.out.println(str);
		char a[]= {0},b[][]= {},c;
		c='t';
		int i = 0,j=0,k = 0;
		while(a[k]!='\0')
		{
			
		  j=0;
		  while(a[k]!=c&&a[k]!='\0')
		  {
			  b[i][j]=a[k];
			  k++;
			  j++;
			  
			  
		  }
		  b[i][j]='\0';
		  i++;
		  if(a[k]!='\0')
		  {
			  k++;
		  }
		}
		int len=i;
		System.out.println("Word after Splitting Sentence are");
		for(i=0;i<len;i++)
		{
			System.out.println(a[i]);
		}

	}

}
