package com.FSDTraining.q8;

public class SquareRoot {

	public static void main(String[] args) {
		
//		Square root calculation ((x1+x2)(x1+x2))+((y1+y2)(y1+y2)) o/p should be rounded of to int; 
//		Sample input: double x1=5; double x2=6; double y1=8; double y2=3; output : 15
		
		double x1=5;
		double x2=6;
		double y1=8;
		double y2=3;
		
		double i = ((x1+x2)*(x1+x2))+((y1+y2)*(y1+y2));
		System.out.println("Square root of given value is " +(int)Math.sqrt(i));
		

	}

}
