/*
 *	Author: Michael Sargsyan
 *  Date: 11/09/2024
 * 	Collaborator(s): 
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
        int[] array = new int[20];
        Random random = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10) + 1;
        }
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
        int targetNumber = random.nextInt(10) + 1;
        ArrayList<Integer> duplicateIndexes = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetNumber) {
                duplicateIndexes.add(i);
            }
        }
        System.out.println(targetNumber);
        for (int index : duplicateIndexes) {
            System.out.print(index + " ");
        }
        System.out.println(duplicateIndexes.size());
        ArrayList<Integer> consecutiveIndexes = new ArrayList<>();
        int consecutiveNumber = -1;

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                consecutiveIndexes.add(i);
                consecutiveNumber = array[i];
            }
        }
        if (!consecutiveIndexes.isEmpty()) {
            System.out.println(consecutiveNumber);
            for (int index : consecutiveIndexes) {
                System.out.print(index + " ");
            }
        }
    }
}