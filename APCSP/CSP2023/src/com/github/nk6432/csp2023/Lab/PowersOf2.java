package com.github.nk6432.csp2023.Lab;

import java.util.Scanner;

public class PowersOf2 {

	public static void main (String[] args){
		Scanner reader = new Scanner(System.in);
		int base, exponent;
		
		System.out.print ("Enter a base: ");
		base = reader.nextInt();
		
		System.out.print ("Enter an exponent [-1 to quit]: ");
		exponent = reader.nextInt();
		
		while (exponent > -1) {
			System.out.println (base + " raised to the power of " + exponent + " is " + Math.pow(base, exponent));
			
			System.out.print ("Enter a base: ");
			base = reader.nextInt();
			
			System.out.print ("Enter an exponent [-1 to quit]: ");
			exponent = reader.nextInt();
		}
	}
}