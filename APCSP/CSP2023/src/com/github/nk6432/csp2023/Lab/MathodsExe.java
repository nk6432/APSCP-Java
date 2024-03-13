package com.github.nk6432.csp2023.Lab;

public class MathodsExe
{
	public static void myMethod1()
	{
		System.out.println("My Function called Num#1");
	}


	public static void main(String[] args)
	{
		System.out.println("About to encounter a method#1.");
		myMethod1();
		myMethod2();
		System.out.println("Method was executed successfully!#2");
	}



	public static void myMethod2()
	{
		System.out.println("Printing from inside myMethod2()!");
	}

}