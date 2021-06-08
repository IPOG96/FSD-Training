package com.FSDTraining.q2;


public class Vowel {

	public static void main(String[] args) {
//		Find the number of vowels in a given string
//		Input1:”NewyorkE” 'e' or 'E' - it should be counted as 1 Output1:2 Hint:irrespective of case
		String s="NewyorkE";
		//String s2=s.toLowerCase();
		//System.out.println(s);
		int count=0;
		for (int i=0;i<s.length();i++) {
			char c=s.charAt(i);
					if(c=='a' ||c=='e'||c=='i'||c=='o'||c=='u')
					{
				    	count++;
					}
					
			
		}
		System.out.println("Number of vowel's in the given string is " +count);
	}

}
