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
    BaseClass base = new BaseClass(1000);

        base.fillArray();

        for (int number : base.getNumbers()) {
            System.out.println(number);
        }
    }
}