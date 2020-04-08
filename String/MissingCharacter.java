package com.String;

import java.util.Arrays;
import java.util.Scanner;

public class MissingCharacter {
	public static void main(String[] args) {
		String s;

		Scanner x = new Scanner(System.in);
		System.out.println("enter the string");
		s = x.nextLine();
		char c[] = s.toLowerCase().toCharArray();
		Arrays.sort(c);
		int t = 0;
		for (int i = 1; i <= c.length - 1; i++) {
			t = (int) c[i] - (int) c[i - 1];
			int l = (int) c[i] - 1;

			while (t > 1) {
				System.out.print((char) l--+" ");
				t--;
			}
		}
	}
}
