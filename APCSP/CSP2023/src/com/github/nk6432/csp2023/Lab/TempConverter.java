//********************************************************************
//  TempConverter.java       Author: Lewis/Loftus/Cocking
//
//  Demonstrates the use of primitive data types and arithmetic
//  expressions.
//********************************************************************
package com.github.nk6432.csp2023.Lab;

import java.util.Scanner;

public class TempConverter
{
   //-----------------------------------------------------------------
   //  Computes the Fahrenheit equivalent of a specific Celsius
   //  value using the formula F = (9/5)C + 32.
   //-----------------------------------------------------------------
   public static void main (String[] args)
   {
      final int BASE = 32;
      final double CONVERSION_FACTOR = 9.0 / 5.0;

      int celsiusTemp = new Scanner(System.in).nextInt();  // value to convert
      double fahrenheitTemp;

      fahrenheitTemp = celsiusTemp * CONVERSION_FACTOR + BASE;

      System.out.println ("Celsius Temperature: " + celsiusTemp);
      System.out.println ("Fahrenheit Equivalent: " + fahrenheitTemp);
   }
}