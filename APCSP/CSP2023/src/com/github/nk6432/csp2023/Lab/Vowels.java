package com.github.nk6432.csp2023.Lab;

import java.util.Scanner;
public class Vowels
{
	//-----------------------------------------------------------------
	// Counts the number of each vowel in a string.
	//-----------------------------------------------------------------
	public static void main (String[] args)
	{
		int acount = 0, ecount = 0, icount = 0, ocount = 0, ucount = 0;
		int other = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println ("Enter a string of characters:");

		//String str = Keyboard.readString();
		String str = scan.nextLine();
		str = str.toLowerCase(); // for consistent counting

		for (int i = 0; i < str.length(); i++)
		{
			if (str.charAt(i) == 'a')
				acount++;
			else
				if (str.charAt(i) == 'e')
					ecount++;
			// else
			if (str.charAt(i) == 'o')
				ocount++;
			// else
			if (str.charAt(i) == 'u')
				ucount++;
			// else
			if (str.charAt(i) == 'i')
				icount++;

			else
			{
				if (str.charAt(i) != 'a'
						|| str.charAt(i) != 'e'
						|| str.charAt(i) != 'i'
						|| str.charAt(i) != 'o'
						|| str.charAt(i) != 'u')

					other++;
			}
			System.out.println ();
			System.out.println ("Number of each vowel in the string:");
			System.out.println ("a: " + acount);
			System.out.println ("e: " + ecount);
			System.out.println ("i: " + icount);
			System.out.println ("o: " + ocount);
			System.out.println ("u: " + ucount);
			System.out.println ("other characters: " + other);
		}}}