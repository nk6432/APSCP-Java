package com.github.nk6432.csp2023.Lab;

public class Star {
	private static char[][] star = new char[10][10];
	
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			for (int j = 10; j > 0; j--) {
				for (char c : star[i]) {
					c = '-';
				}
				star[i][j] = '*';
				star[j][i] = '*';
				System.out.println(star[i]);
			}
		}
	}
}
