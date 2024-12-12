/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
        PooleDwarf[] dwarfs = new PooleDwarf[7];
        Random random = new Random();
        for (int i = 0; i < dwarfs.length; i++) {
            String name = randName();
            int age = random.nextInt(100);
            dwarfs[i] = new PooleDwarf(name, age);
        }

        String nameToCheck = dwarfs[0].getName();
        int dupCount = 0;

        for (int i = 1; i < dwarfs.length; i++) {
            if (dwarfs[i].isSameName(nameToCheck)) {
                dupCount++;
            }
        }
        System.out.println("First dwarf's name: " + nameToCheck);
        System.out.println("Number of duplicates: " + dupCount);
        if (dupCount > 0) {
            System.out.println("Duplicate name: " + nameToCheck);
        } else {
            System.out.println("No duplicates found.");
        }
    }
}