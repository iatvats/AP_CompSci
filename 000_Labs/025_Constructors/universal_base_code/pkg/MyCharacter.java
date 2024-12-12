/*
 *	Author:  Micahel Sargsyan
 *  Date: 10/17/2024
*/

package pkg;

import java.util.Scanner;
import java.util.Random;

public class MyCharacter {
    private String role;

    public MyCharacter() {
        role = "No role";
    }

    public MyCharacter(String roleInput) {
        if (roleInput.equals("Wizard")) {
            role = "Wizard";
            System.out.println("You chose Wizard");
        } else if (roleInput.equals("Warrior")) {
            role = "Warrior";
            System.out.println("You chose Warrior");
        } else if (roleInput.equals("Rogue")) {
            role = "Rogue";
            System.out.println("You chose Rogue");
        } else {
            role = "No role";
            System.out.println("Try again");
        }
    }

    public void displayRole() {
        System.out.println("Role is: " + role);
    }
}