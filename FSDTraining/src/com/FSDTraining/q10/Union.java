package com.FSDTraining.q10;

import java.util.Arrays;

public class Union
{

    public static void main(String[] args)
    {
        int[] A = {1, 2, 3, 3};
        int[] B = {2, 3, 1, 1};
        System.out.println("Result"+Arrays.toString(unionArrays(A, B)));
    }

    /* Union of multiple arrays */
    public static int[] unionArrays(int[]... arrays)
    {
        int maxSize = 0;
        int counter = 0;

        for(int[] array : arrays) 
        	maxSize += array.length;
      //  System.out.println(maxSize);
        int[] accumulator = new int[maxSize];

        for(int[] array : arrays)
        {//System.out.println("array"+Arrays.toString(array));
            for(int i : array)
            {
            //	System.out.println("Accumulator array"+Arrays.toString(accumulator)+"counter"+counter+"i"+i);
                if(!isDuplicated(accumulator, counter, i))  
                {
                    accumulator[counter++] = i;
                 //   System.out.println("counter"+counter+"acc array"+ accumulator[counter++]);
                }
            }
            }
        int[] result = new int[counter];
        for(int i = 0; i < counter; i++) result[i] = accumulator[i];

        return result;
    }

    public static boolean isDuplicated(int[] array, int counter, int value)
    {
      // System.out.println("isDuplicated-------"+counter);
    	for(int i = 0; i < counter; i++) 
        	if(array[i] == value)  //1,1
        		return true;
        	  return false;
    }
}