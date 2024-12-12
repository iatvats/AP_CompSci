/*
 *	Author: Michael Sargsyan 
 *  Date: 10/26/2024
 *	Collaborator(s): 
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


class starter {
	public static void main(String args[]) {
        Dog dog1 = new Dog("Bob");
        dog1.setAge(4);
        Dog dog2 = new Dog("Max", "bulldog");
        if (dog1.isSleeping()) {
            System.out.println(dog1.getName() + " is asleep.");
        } else {
            dog1.bark();
        }

        if (dog2.isSleeping()) {
            if (!dog1.isSleeping()) {
                dog2.bark();
            }
        } else {
            if (!dog1.isSleeping()) {
                dog2.bark();
            }
        }
    }
}