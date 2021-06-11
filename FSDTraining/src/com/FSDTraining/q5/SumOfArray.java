package com.FSDTraining.q5;

public class SumOfArray {

	public static void main(String[] args) {
//		Find the sum of the numbers in the given input string array Input:{“2AA”,”12”,”ABC”,”c1a”) 
//        Output:6 (2+1+2+1) Note in the above array 12 must not considered as such it must be considered as 1,2

		String[] arr = { "2AA", "12", "ABC", "C1A" };
		int sum = 0;
		int n;

		for (int i = 0; i < arr.length; i++) {

			char[] chararray = arr[i].toCharArray();

			for (char ch : chararray) {

				boolean b = Character.isDigit(ch);
				if (b) {

					n = Character.getNumericValue(ch);

					sum += n;

				}

			}

		}
		System.out.println(sum);

	}
}
