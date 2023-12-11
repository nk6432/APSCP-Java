package com.github.nk6432.csp2023.Lab;

import java.util.Scanner;

public class Age
{
//-----------------------------------------------------------------
// Reads the user's age and prints comments accordingly.
//-----------------------------------------------------------------
public static void main (String[] args)
{
final int MINOR = 21;
Scanner scanner = new Scanner (System.in);

System.out.print ("Enter your age: ");
int age = scanner.nextInt();

System.out.println ("You entered: " + age);

if (age < MINOR)
{
System.out.println ("Youth is a wonderful thing. Enjoy.");
}
else
{
System.out.println ("You can do some parties .");
}

System.out.println ("Age is a state of mind.");
}
}