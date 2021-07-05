package com.FSDTraining.q16;

public class CharReplace {

	public static void main(String[] args) {
		
//		Given a method with two strings as input. Write code to modify the first string such that all characters are replace by plus sign(=) except the characters which are present in the second string. That is, if one or more characters of first string appear in second string, they will not be replace by +. Return the modified string as output. Note-ignore case.
//
//		Example: input1 = New York input2 = New Jersy output = New Y+r+
		
		modify("New York","New Jersey");
		
		

	}
	public static void modify(String input1,String input2) {
		
		for (char inputvalue : input1.toCharArray())
		{
			//System.out.println(inputvalue);
			if(!input2.toLowerCase().contains(""+Character.toLowerCase(inputvalue))) {
				input1=input1.replace(inputvalue, '+');
				
			}
			
		}
		System.out.println(input1);
		
	}
}
