package com.github.nk6432.csp2023.Lab;

import java.util.Scanner;

public class Factorial {
	private static int num, sum = 1;
	private static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		num = scanner.nextInt();
		while (num > 0) {
			for (int factor = 2; factor <= num; factor++) {
	            sum *= factor;
	        }
			System.out.println("the factorial of " + num + " is " + sum);
			num = scanner.nextInt();
		}
	}

}
