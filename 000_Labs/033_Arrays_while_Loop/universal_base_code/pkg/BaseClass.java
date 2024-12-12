/*
 *	Author:  Michael Sargsyan 
 *  Date: 11/06/2024
*/

package pkg;
import java.util.Scanner;
import java.util.Random;


public class BaseClass {
    private int[] arr; 

    public BaseClass(int s) {
        arr = new int[s];
        populateArray();
    }

    private void populateArray() {
        Random rand = new Random();
        int i = 0;
        while (i < arr.length) {
            arr[i] = rand.nextInt();
            i++;
        }
    }

    public int[] getArray() {
        return arr;
    }
}