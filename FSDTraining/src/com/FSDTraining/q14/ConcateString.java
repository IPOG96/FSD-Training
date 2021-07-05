package com.FSDTraining.q14;

public class ConcateString {
	public static void main(String[] args) {	
//		Concatenate the character in a given position. If there is no character in a given position place "$" sign. input1[]={"abc","da","ram"}; input2=3; hint : 3rd character is "c" in "abc" 3rd character is not present in "da", so place "$" 3rd character is "m" in "ram" 
//		concate all the characters to a single string "c$m" o/p string ="c$m";

		String[] input1 = { "abc", "da", "ram" };
		int c = 2;
		String output = "";

		for (int i = 0; i <= input1.length -1; i++) {
			//System.out.println(input1.length-1);
			char[] chararray = input1[i].toCharArray();
			//System.out.println(chararray);
			if (c <= chararray.length -1) {
				//System.out.println(chararray.length);
				for (int j = 0; j <= chararray.length - 1; j++) {
					// System.out.println(j);
					if (c == j) {
						// System.out.println();
						output = output + chararray[j];

					}

				}
			} else {
				if (c >= chararray.length -1) {
					//System.out.println("test");
					output = output + "$";

				}

			}

		}
		System.out.println(output);
	}
}
