package com.FSDTraining.q13;

import java.util.Arrays;

public class DtoB{    
	public static void toBinary(int decimal){    
	     int binary[] = new int[40];
	    // System.out.println(Arrays.toString(binary));
	     int index = 0;    
	     while(decimal > 0){    
	       binary[index++] = decimal%2;
	      // System.out.println(Arrays.toString(binary));
	       decimal = decimal/2;
	       System.out.println(decimal);
	     }    
	     for(int i = index-1;i >= 0;i--){    
	       System.out.print(binary[i]);    
	     }    
	System.out.println();//new line  
	}    
	public static void main(String args[]){      
	System.out.println("Decimal of 10 is: ");  
	toBinary(10);     
	}}  


