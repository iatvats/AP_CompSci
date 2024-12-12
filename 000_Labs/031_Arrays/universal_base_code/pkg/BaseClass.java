/*
 *	Author: Michael Sargsyan  
 *  Date: 11/05/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
    int[] numbers = new int[10];

    public void populateArray() {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = 9 - i;
        }
    }

    public void printArray() {
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}