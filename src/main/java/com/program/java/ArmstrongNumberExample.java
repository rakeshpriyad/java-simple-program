package com.program.java;
/**
 * What is armstrong number?
A armstrong number is a number such that the sum of the cubes of its digits is equal to the number itself.


 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153.
 
 * @author aayushraj
 *
 */
public class ArmstrongNumberExample {
	public static void main(String... args) {
		int number = 153;
		int sum = 0;
		int temp = number; // temp will hold reference to number.
		while (temp > 0) {
			int rem = temp % 10;
			sum += (rem * rem * rem);
			temp = temp / 10;
		}

		if (number == sum)
			System.out.println(number + " is armstrong number.");
		else
			System.out.println(number + " is not armstrong number.");
	}
}