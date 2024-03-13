package com.github.nk6432.csp2023.Lab;

public class MinList {
	private static int min = 100;
	private static int max = 0;
	private static int[] list = {5, 3, 8, 4, 7, 2, 1, 10};
	private static int oddSum = 0;
	private static int evenSum = 0;
	private static int[] a = new int[8];
	public static void main(String[] args) {
		a[0] = 5;
		a[1] = 3;
		a[2] = 8;
		a[3] = 4;
		a[4] = 7;
		a[5] = 2;
		a[6] = 1;
		a[7] = 10;
		for (int i = 0; i < a.length; i++) {
			System.out.print("\t" + a[i]);
			if (a[i] < min) {
				min = a[i];
			}
			if (a[i] % 2 == 0) {
				evenSum += a[i];
			}
			else {
				oddSum += a[i];
			}
		}
		System.out.print("\nMy even Sum is " + evenSum);
		System.out.print("\nMy odd Sum is " + oddSum + "\n");
		for (int i = 0; i < list.length; i++) {
			System.out.print("\t" + list[i]);
			if (a[i] > max) {
				max = list[i];
			}
		}
		System.out.println("\nThe min number is " + min);
		System.out.println("The max number is " + max);
	}

}
