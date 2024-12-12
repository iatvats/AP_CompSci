/*
 *	Author:  Michael Sargsyan 
 *  Date: 10/08/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		
        toString("Hello");

        toStringCombined("Hello", "Bob");
        toStringCombined("How are you", "Bob");
    }

    public static void toString(String input) {
        System.out.println(input);
    }

    public static void toStringCombined(String input1, String input2) {
        System.out.println(input1 + " " + input2);
    }
}