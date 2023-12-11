package com.github.nk6432.csp2023.Lab;

import java.util.Scanner;

public class Sample_String10{
	public static void main (String[] args)
	{
		String str;
		Scanner scan = new Scanner(System.in);

		System.out.println ("Enter a string :");
		str = scan.nextLine();

		for (int index=0; index < str.length(); index++)
			System.out.println (str.charAt(index));
	}
}