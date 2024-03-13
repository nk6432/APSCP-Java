package com.github.nk6432.csp2023.Lab;

public class MethodLoop {

	// method defined
	private static double getSquarert(double x)
	{
		return Math.sqrt(x);
	}

	public static void main(String[] args)
	{
		for (int i = 0; i <= 50; i+=5)
		{
			double result = getSquarert(i);
			System.out.println("Square of " + i + " is: " + result);

		}


	}
}