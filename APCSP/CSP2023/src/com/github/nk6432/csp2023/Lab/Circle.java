package com.github.nk6432.csp2023.Lab;

import java.util.Scanner;

public class Circle {
	private static Scanner scanner;
	private static double radius;
	
	public static void main (String[] args) {
		scanner = new Scanner(System.in);
		radius = scanner.nextDouble();
		System.out.println(Math.PI * Math.pow(radius, 2));
		scanner.close();
	}
}
