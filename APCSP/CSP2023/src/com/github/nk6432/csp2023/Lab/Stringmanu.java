package com.github.nk6432.csp2023.Lab;

import java.util.Scanner;

public class Stringmanu {
	private static Scanner scanner;
	private static String str;
	public static void main (String[] args) {
		scanner = new Scanner(System.in);
		str = scanner.nextLine();
		System.out.println("-------------\n" + str + "\n-------------");
		scanner.close();
	}
}
