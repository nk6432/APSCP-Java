package com.github.nk6432.csp2023.Lab;

import java.util.Scanner;

public class Guests {
	
	private static String[] guests = {"Paul", "Wendy", "Jared", "Eric", "Ayame", "Ian", "isobel", "Hakem"};
	private static String name;
	private static Scanner scanner;
	
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		name = scanner.nextLine();
		for (String str : guests) {
			if (name.equals(str)) {
				System.out.println(true);
			}
			else {
				System.out.println(false);
			}
		}
	}

}
