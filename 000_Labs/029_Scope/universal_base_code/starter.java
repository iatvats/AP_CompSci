/*
 *	Author:  Michael Sargsyan 
 *  Date: 10/30/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class Donkey {
    private String name;

    public Donkey() {
        this.name = "Donkey";
    }

    public String getName() {
        return name;
    }

    public void interact(Ogre shrek) {
        System.out.println(shrek.getName() + ", parfaits may be the most delicious thing on the whole planet!");
    }
}