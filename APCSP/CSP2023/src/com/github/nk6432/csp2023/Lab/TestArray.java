package com.github.nk6432.csp2023.Lab;

public class TestArray {

	private static int sum;
	private static int[] age = {15, 13, 18, 14, 17, 12, 20, 30};
	
	public static void main(String[] args) {
		for (int i : age) {
			System.out.print("\t" + age[i]);
			sum += age[i];
		}
		System.out.println(sum / age.length);
	}

}
