package com.github.nk6432.csp2023.Lab;


public class DiceRoll {
	private static int die1, die2, snake, box;
	private static int count = 101;
	
	public static void main(String[] args) {
		for (int i = 0; i < count; i++) {
			die1 = (int)(Math.random() * 6) + 1;
			die2 = (int)(Math.random() * 6) + 1;
			System.out.println(i + "- Dice#1-->" + die1 + " Dice#2-->" + die2);
			if (die1 == die2) {
				if (die1 == 1) {
					snake++;
				}
				else if (die1 == 6) {
					box++;
				}
			}
		}
		System.out.println("You rolled snake eyes " + snake + " out of " + count + " rolls.");
		System.out.println("You rolled Boxcard " + box + " out of " + count + " rolls.");
	}

}
