package com.FSDTraining.q4;

public class WordLength {

	public static void main(String[] args) {
		// Find the number of words are of given length Input1:{“aa”,”b”,”cc”,”ddd”}
		// Input2:2 Output1:2

		String[] input = { "aa", "b", "cc", "ddd" };
		// int input2 =Integer.parseInt(args[0]);
		int input2 = 2;
		int count = 0;
		for (int i = 0; i < input.length; i++) {
			if (input[i].length() == input2) {
				// System.out.println(input[i]);
				count++;

			}

		}
		System.out.println("No of words of given length is " + count);

	}

}
