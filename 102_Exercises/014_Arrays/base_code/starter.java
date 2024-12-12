/*
 *	Author: Michael Sargsyan
 *  Date: 11/05/2024
*/
import java.util.Scanner;

class starter {
        int[] array1 = new int[1001];
        for (int i = 0; i < array1.length; i++) {
            array1[i] = (i + 1) * 3;
        }

        int[] array2 = new int[1001];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = 1000 - i;
        }

        System.out.println("Array 1:");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Index: " + i + " Value: " + array1[i]);
        }

        System.out.println("\nArray 2:");
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Index: " + i + " Value: " + array2[i]);
        }
    }
}
