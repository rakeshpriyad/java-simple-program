package com.program.java;
/*
 * What is palindrome?
A. If reverse of number is same as original one, than its palindrome or palindrome is a number which reads the same backward or forward.

 Example in java>
input : 121
output: it’s palindrome.
 */
public class PalindromeTillExample {
	public static void main(String[] args) {
		System.out.println("List of Palindrome between 1 to 1000");
		for (int i = 10; i <= 1000; i++) {
			char[] ar = String.valueOf(i).toCharArray();
			boolean isPalindrome = true;
			isPalindrome = isPalindrom(ar, isPalindrome);
			if (isPalindrome) {
				System.out.println(i);
			}
		}
	}

	private static boolean isPalindrom(char[] ar, boolean isPalindrome) {
		for (int j = 0; j < ar.length / 2; j++) {
			if (ar[j] != ar[ar.length - 1 - j]) {
				isPalindrome = false;
				break;
			}
		}
		return isPalindrome;
	}
}