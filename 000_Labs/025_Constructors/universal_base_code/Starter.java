/*
 *	Author:  Michael Sargsyan 
 *  Date: 10/17/2024
*/

import pkg.MyCharacter;
import java.util.Scanner;
import java.util.Random;


class Starter {
    public static void main(String[] args) {
        MyCharacter emptyCharacter = new MyCharacter();
        emptyCharacter.displayRole();

        Scanner sc = new Scanner(System.in);
        System.out.print("Role: (Wizard, Warrior, Rogue): ");
        String userRole = sc.nextLine();

        MyCharacter userCharacter = new MyCharacter(userRole);
        userCharacter.displayRole();
        
        sc.close(); 
    }
}