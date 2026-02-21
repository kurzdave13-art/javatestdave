package Lab5;
/**
* File: Lab05Prob02.java
* Class: CSCI 1301
* Author: Dave Kurz
* Created on: Feb 20, 2026
* Last Modified: Feb 20, 2026
* Description: This program gets a string from a user and displays certain characters in the string
*/
import java.util.Scanner;
public class Lab05Prob02 {
    public static void main(String[] args) {
        // prompt user to enter a string
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String value:");
        String s = input.nextLine();
        // check if word is less than 4
        if (s.length() < 4) {
            System.out.println("The string you entered " + s +  " contains less than 4 characters");
        }else {
            // display characters in the string
            System.out.println("For the string " + s);
            System.out.println("first letter is " + s.charAt(0));
            System.out.println("last letter is " + s.charAt(s.length() - 1));
            System.out.println("\"middle\" letter is " + s.charAt((int)Math.ceil(s.length() / 2.0)));
        }
    }
}
