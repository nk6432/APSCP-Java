package com.github.nk6432.csp2023.Lab;

import java.util.Scanner;

public class Power {
	private static Scanner scanner;
	private static double base, expo;
	
	public static void main (String[] args) {
		scanner = new Scanner(System.in);
		base = scanner.nextDouble();
		expo = scanner.nextDouble();
		System.out.println(Math.pow(base, expo));
	}
}
