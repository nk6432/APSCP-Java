package com.github.nk6432.csp2023.Lab;

import java.util.Scanner;

public class SquareRoot {
	private static Scanner scanner;
	private static double num;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		num = scanner.nextDouble();
		System.out.println(Math.sqrt(num));
	}

}
