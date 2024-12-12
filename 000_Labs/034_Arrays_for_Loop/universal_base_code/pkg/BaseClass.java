/*
 *	Author:  Michael Sargsyan
 *  Date: 11/07/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
    private int[] numbers;

    public BaseClass(int size) {
        numbers = new int[size];
    }

    public void fillArray() {
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100);
        }
    }

    public int[] getNumbers() {
        return numbers;
    }
}