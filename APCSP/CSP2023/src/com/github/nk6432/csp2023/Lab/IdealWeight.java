package com.github.nk6432.csp2023.Lab;

import java.util.Scanner;

public class IdealWeight {
	private static Scanner scanner;
	private static int feet, inches;
	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		System.out.println("Please enter your height in feet and inches...");
		System.out.print("Feet: ");
		feet = scanner.nextInt();
		System.out.print("Inches: ");
		inches = scanner.nextInt();
		System.out.println("The ideal weight for a " + feet + " foot " + inches + " male is " +(106 + (feet * 12 + inches - 60) * 6) + " pounds.");
		System.out.println("A weight in the range " + Math.ceil((106 + (feet * 12 + inches - 60) * 6) * 0.85) + " to " + Math.floor((106 + (feet * 12 + inches - 60) * 6) * 1.15) + " is okay.");
		System.out.println("\nThe ideal weight for a " + feet + " foot " + inches + " female is " +(100 + (feet * 12 + inches - 60) * 5) + " pounds.");
		System.out.println("A weight in the range " + Math.ceil((100 + (feet * 12 + inches - 60) * 5) * 0.85) + " to " + Math.floor((100 + (feet * 12 + inches - 60) * 5) * 1.15) + " is okay.");
	}
}
