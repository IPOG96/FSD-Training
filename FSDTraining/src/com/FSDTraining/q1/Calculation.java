package com.FSDTraining.q1;

public class Calculation {

	public static void main(String[] args) {
//Create a calculator class to perform addition, subtraction, multiplication and division of two integers. 
//Get inputs from command line/program arguments.

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		System.out.println("Sum is " + (a + b));
		System.out.println("Sub is " + (a - b));
		System.out.println("Multiplication is " + (a * b));
	}

}
