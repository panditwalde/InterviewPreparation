package com.String;

public class CharOccourence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "AAaabbbcccdde";
		String output = "";
		int count = 1;
		test = test + " ";
		for (int i = 0; i < test.length() - 1; i++)
		{
			if (count == 1)
				output = output + test.charAt(i);
			if (test.charAt(i + 1) == test.charAt(i))
			{
				count++;
				continue;
			}
			output = output + count;
			count = 1;
		}
		System.out.println(output);

	}

}



/*
char a[8]="a3b4c2"; 
int i,j,p; 
double q; 
gets(a); 

for(i=0;i<strlen(a);i=i+2) 
{ 
p=a[i+1] - '0'; 
for(j=p;j>0;j--) 
{ 
printf("%c",a[i]); 
} 
} */
