/*
 *	Author: Michael Sargsyan
 *  Date: 10/22/2024
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		Employee jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		Employee pam = new Employee(2011,"Pam","Beesly", 2250);
		pam.employeeToString();
		Employee bob = new Employee(5798, "Bob", "Fasy", 4416.66);
		bob.employeeToString();
		michael.raiseSalary(4);
        dwight.raiseSalary(3);
        jim.raiseSalary(2);
        pam.raiseSalary(4);
        bob.raiseSalary(3);
        michael.employeeToString();
        dwight.employeeToString();
        jim.employeeToString();
        pam.employeeToString();
        bob.employeeToString();
        System.out.println("Annual Salary Michael: $" + michael.getAnnualSalary());
        System.out.println("Annual Salary Dwighte: $" + dwight.getAnnualSalary());
        System.out.println("Annual Salary Jimt: $" + jim.getAnnualSalary());
        System.out.println("Annual Salary Pam: $" + pam.getAnnualSalary());
        System.out.println("Annual Salary Bob: $" + bob.getAnnualSalary());
	}
}