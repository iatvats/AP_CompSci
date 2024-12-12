/*
 *	Author:  Michael Sargsyan 
 *  Date: 11/13/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;



public class BaseClass {
    private int example;

    public BaseClass() {
        this.example = 0;
    }

    public void toStringArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public int getArrayAverage(int[] array) {
        int sum = 0;
        for (int element : array) {
            sum += element;
        }
        return sum / array.length;
    }

    public int getArrayMax(int[] array) {
        int max = array[0];
        for (int element : array) {
            if (element > max) {
                max = element;
            }
        }
        return max;
    }

    public int getArrayMin(int[] array) {
        int min = array[0];
        for (int element : array) {
            if (element < min) {
                min = element;
            }
        }
        return min;
    }
}