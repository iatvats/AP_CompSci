/*
 *	Author:  Michael Sargsyan
 *  Date: 11/07/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
    private int[] numbers;
    public BaseClass() {
        Random rand = new Random();
        int arraySize = rand.nextInt(150) + 51;
        numbers = new int[arraySize];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(100) + 1;
        }
    }
    public int findMinimum() {
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }
    public int findMaximum() {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
    public double calculateAverage() {
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        return (double) sum / numbers.length;
    }
    public int getArraySize() {
        return numbers.length;
    }
    public int[] getNumbers() {
        return numbers;
    }
}