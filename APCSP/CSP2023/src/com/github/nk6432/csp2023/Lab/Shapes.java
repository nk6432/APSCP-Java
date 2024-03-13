package com.github.nk6432.csp2023.Lab;

import java.util.Scanner;

public class Shapes {
	public static void main(String[] args) {
		menu();
	}
	public static double getCube(double s) {
		return Math.pow(s, 3);
	}
	public static double getRectPrism(double l, double w, double h) {
		return l * w * h;
	}
	public static double getSphere(double r) {
		return (4/3) * Math.PI * Math.pow(r, 3);
	}
	public static double getCylinder(double r, double h) {
		return Math.PI * Math.pow(r, 2) * h;
	}
	public static double getCone(double r, double h) {
		return (1/3) * Math.PI * Math.pow(r, 2) * h;
	}
	public static double getPyramid(double s, double h) {
		return (1/3) * Math.pow(s, 2) * h;
	}
	public static void menu() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Select an option:");
		System.out.println("1 - Cube"
				+ "\n2 - Rectangular Prism"
				+ "\n3 - Sphere"
				+ "\n4 - Right Circular Cylinder"
				+ "\n5 - Right Circular Cone"
				+ "\n6 - Right Square Pyramid");
		switch(scanner.nextInt()) {
			case (1):
				System.out.println(getCube(scanner.nextDouble()));
				break;
			case (2):
				System.out.println(getRectPrism(scanner.nextDouble(), scanner.nextDouble(), scanner.nextDouble()));
				break;
			case (3):
				System.out.println(getSphere(scanner.nextDouble()));
				break;
			case (4):
				System.out.println(getCylinder(scanner.nextDouble(), scanner.nextDouble()));
				break;
			case (5):
				System.out.println(getCone(scanner.nextDouble(), scanner.nextDouble()));
				break;
			case (6):
				System.out.println(getPyramid(scanner.nextDouble(), scanner.nextDouble()));
				break;
		}
	}
}
