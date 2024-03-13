package com.github.nk6432.csp2023.Lab;

import java.util.Scanner;

public class method {

	public static void main(String[] args) {
		double[] arr = new double[3];
		double x = 1, y = 0, z = 0;
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < 3; i++) {
			arr[i] = scanner.nextDouble();
			y = x + 1;
			z = y * 2;
		}
		System.out.println(getAverage(arr));
		System.out.println(hasMidpoint(x, y, z));
		System.out.println(getMin(x, y, z));
	}
	public static boolean hasMidpoint(double x, double y, double z) {
		if ((x + y) / 2 == z || (x + z) / 2 == y || (z + y) / 2 == x)
			return true;
		return false;
		
	}
	public static double getAverage(double[] arr) {
		double sum = 0;
		for (double i : arr) {
			sum += i;
		}
		return sum / arr.length;
	}
	public static double getMin(double x, double y, double z) {
		return Math.min(Math.min(x, y), z);
	}
}
