package com.FSDTraining.q3;

public class MinMax {

	public static void main(String[] args) {
		//Find the sum of maximum and minimum number from a given input array Input:{19,17,12} max - 19 min - 12 sum - 31 Output:31
		
		int[] arr= {18,19,17,12,10};
		int min =arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>arr[0])
			{
				max=arr[i];
			}
			else if(arr[i]<arr[0])
			{
				min=arr[i];
			}
		}
		System.out.println("Max is " +max);
		System.out.println("Min is " +min);
		System.out.println("Sum of min and max is " +(max+min));
		
		

	}

}
