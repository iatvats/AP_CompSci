/*
 *	Author:  Michael Sargsyan
 *  Date: 11/07/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass();
        System.out.println("Size: " + test.getArraySize());
        System.out.println("Min value: " + test.findMinimum());
        System.out.println("Max value: " + test.findMaximum());
        System.out.printf("Value:", test.calculateAverage());
        System.out.println("Elements:");
        for (int number : test.getNumbers()) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}