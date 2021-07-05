package com.FSDTraining.q15;

public class UniqueChar {
	
	// Display unique characters in a string. input:"helloworld" output:"helowrd"

	private static void printUniqueCharacters(String input) {
		String temp = "";
		
		for (int i = 0; i < input.length(); i++) {
			char current = input.charAt(i);
			if (temp.indexOf(current) == -1) {
				temp = temp + current;
			}
		}
		System.out.println("Input: " + input);
		System.out.println("Output: " + temp);
	}

	public static void main(String[] args) {
		printUniqueCharacters("helloworld");
	}



}
