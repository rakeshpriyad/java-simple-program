package com.program.java;

public class ReplaceAllVowelsIntoCapitalCaseExample {
	public static void main(String[] args) {
		String str = "This is a simple program";
		System.out.println("original string = " + str);
		str = str.replaceAll("a", "A").replaceAll("e", "E").replaceAll("i", "I").replaceAll("o", "O").replaceAll("u", "U");
		System.out.println("After replacing all vowels into capital case = " + str);
	}
}