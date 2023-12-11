package com.github.nk6432.csp2023.Lab;

public class RandomMath {
	private static int s1, s2, s3;
	private static final int LIMIT = 3;
	public static void main(String[] args) {
		s1 = (int) (Math.random() * LIMIT);
		s2 = (int) (Math.random() * LIMIT);
		s3 = (int) (Math.random() * LIMIT);
		System.out.println(s1 + " " + s2 + " " + s3);
		if (s1 == s2 && s2 == s3) {
			System.out.println("Jackpot!!!");
		}
		else if (s1 == s2 || s1 == s3 || s2 == s3) {
			System.out.println("Matched 2!");
		}
		else {
			System.out.println("You lost!");
		}
	}
}
