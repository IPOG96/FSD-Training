package com.FSDTraining.q17;

public class Encryption {
	
	/*Given a method with a string input. Write code to encrypt the given string using following rules and return the encrypted string:
		a. Replace the character at odd positions by next character in alphabet b. Leave the characters at even positions unchanged

		Note:

		if an odd position character is 'z' replace it by 'a'
		assume the first character in the string is at position 1
		Example input = curiosity output = dusipsjtz*/
	
	public static void main(String[] args) {
		replace("Furiosity");
		//replace("zebra");
	}
	private static void replace(String input) {
		System.out.println("input:"+input);

		for(int index=0;index<input.length();index++)
		{
			if((index+1)%2 != 0)
			{
				System.out.println(index);
				char beginningAlphabet=(Character.isLowerCase(input.charAt(index))?'a':'A');
				System.out.println("beginningAlphabet"+beginningAlphabet);
				System.out.println((input.charAt(index) - beginningAlphabet));
				int position=(input.charAt(index) - beginningAlphabet) +1;
				System.out.println("position"+position);
				int s=(position%26);System.out.println("testing s"+s);
				char value=(char)((position%26) + beginningAlphabet);
				System.out.println("value"+value);
				input=input.replace(input.charAt(index),value);				
			}
				
		}
		
		System.out.println("output:"+input);
		
	}

}