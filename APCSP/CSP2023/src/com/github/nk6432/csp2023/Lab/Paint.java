package com.github.nk6432.csp2023.Lab;

import java.util.Scanner;

public class Paint {
	private static Scanner scanner;
	private static double height, length, width;
	private static int num_win, num_door;
	public static void main (String[] args) {
		scanner = new Scanner(System.in);
		System.out.print("Enter the length of the room: ");
		length = scanner.nextDouble();
		System.out.print("Enter the width of the room: ");
		width = scanner.nextDouble();
		System.out.print("Enter the height of the room: ");
		height = scanner.nextDouble();
		System.out.print("How many windows are in the room: ");
		num_win = scanner.nextInt();
		System.out.print("How many doors are in the room: ");
		num_door = scanner.nextInt();
		System.out.println(((width * length) + (2 * width * height) + (2 * length * height) - (num_win * 15) - (num_door * 20)) / 350);
	}
}