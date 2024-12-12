/*
 *	Author:  Michael Sargsyan
 *  Date: 11/06/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
		// Your code goes below here
		BaseClass test = new BaseClass(1000);

        int[] arr = test.getArray();
        int i = 0;

        while (i < arr.length) {
            System.out.println(arr[i]);
            i++;
        }
    }
}