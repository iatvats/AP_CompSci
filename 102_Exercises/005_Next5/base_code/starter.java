/*
 *	Author:
 *  Date:
 *	Collaborator(s): 
*/
import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
	Scanner sc = new Scanner(System.in);
	System.out.println("Please enter a number: ");
    int numb = sc.nextInt();
    	System.out.println("Here are the next 5 numbers:" + (numb+1) + " " + (numb+2) + " " + (numb+3) + " " + (numb+4) + " " + (numb+5));
		System.out.println("Here are the next 5 multiples:" + (numb*2) + " " + (numb*3) + " " + (numb*4) + " " + (numb*5) + " " + (numb*6));
		int q = 5;
		System.out.println("Here is 5 divided by 100:" + " " + (q/100));
		System.out.println("Here is 5 divided by 10:" + " " + (q/10));
    	


	}
}
