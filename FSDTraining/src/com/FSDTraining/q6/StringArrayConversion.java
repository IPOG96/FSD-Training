package com.FSDTraining.q6;

import java.util.Arrays;

public class StringArrayConversion {

	public static void main(String[] args) {
		// Convert String array to String String[] input1=["Vikas","Lokesh",Ashok]
		// Expected output String: "Vikas,Lokesh,Ashok"

		String[] input1 = { "Vikas", "Lokesh", "Ashok" };

		String str = Arrays.toString(input1);
		System.out.println(str);

	}

}
