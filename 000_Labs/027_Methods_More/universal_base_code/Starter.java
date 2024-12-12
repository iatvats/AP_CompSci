/*
 *	Author:  Micahel Sargsyan 
 *  Date: 10/24/2024
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;


public class Starter {
    public static void main(String[] args) {
        MyCharacter character = new MyCharacter();
        character.setAll("Wizard", 4, 3, 2, 1);
        System.out.println(character.toString());
    }
}