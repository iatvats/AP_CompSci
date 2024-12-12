/*
 *	Author:  Michael Sargsyan 
 *  Date:10/10/2024
*/

import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
        int b = 3;
        int e = 4;
        
        System.out.println(b + " to the power of " + e + " is: " + pow(b, e));
    }

    public static int pow(int x, int y) {
        int result = 1;

        if (y == 0) {
            return 1;
        }

        for (int i = 0; i < y; i++) {
            result *= x;
        }

        return result;
    }
}