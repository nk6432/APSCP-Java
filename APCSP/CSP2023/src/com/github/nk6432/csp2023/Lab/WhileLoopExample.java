package com.github.nk6432.csp2023.Lab;


public class WhileLoopExample {
	private static int i = 0;
	private static int sum;
	
	public static void main(String[] args) {
		while (i <= 10) {
			System.out.println(i);
			sum += i;
			i++;
		}
		System.out.println("the sum of all numbers " + sum);
	}
}
