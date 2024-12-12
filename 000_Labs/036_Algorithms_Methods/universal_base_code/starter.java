/*
 *	Author:  Michael Sargsyan 
 *  Date: 11/13/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
        BaseClass base = new BaseClass();

        int[] randomArray = new int[100];
        Random random = new Random();
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = random.nextInt(100) + 1;
        }

        base.toStringArray(randomArray);
        System.out.println(base.getArrayAverage(randomArray));
        System.out.println(base.getArrayMax(randomArray));
        System.out.println(base.getArrayMin(randomArray));
    }
}