package com.github.nk6432.csp2023.Lab;

public class ForLoop {
	private static int sum;
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i += 2) {
			System.out.println(i);
			sum += i;
		}
		System.out.println(sum);
	}

}
