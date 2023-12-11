package com.github.nk6432.csp2023.Lab;

import java.util.Scanner;

public class Min3 {
	private static Scanner scanner;
	private static int n1, n2, n3;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Enter 3 numbers: ");
		n1 = scanner.nextInt();
		n2 = scanner.nextInt();
		n3 = scanner.nextInt();
		System.out.println("The minimum value is " + Math.min(Math.min(n1, n2), n3));
	}
}
