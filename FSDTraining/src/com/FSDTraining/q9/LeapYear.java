package com.FSDTraining.q9;

public class LeapYear {

	public static void main(String[] args) {
		// Calculate whether given year as leap or not; Sample input: int year = 2020;
		// Sample output: boolean isLeapYear = true;is
		int year = 2020;
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
			System.out.println(year + " is a Leap year");
		} else {
			System.out.println(year + " is not a Leap Year");
		}

	}
}
