package Lab5;
/**
* File: Lab05Prob03.java
* Class: CSCI 1301
* Author: Dave kurz
* Created on: Feb 20, 2026
* Last Modified: Feb 20, 2036
* Description: Prompt a user to write a string and display the reverse
*/
import java.util.Scanner;
public class Lab05Prob03 {
    public static void main(String[] args) {
        // prompt the user to enter a string
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a five letter word:");
        String word = input.nextLine();
        // check is word count is 5
        if (word.length() > 5 || word.length() < 5) {
            System.out.println("The string you entered (" + word + ") does not contain 5 characters");
        }else {
            // declare characters in the string
            char c1 = word.charAt(0);
            char c4 = word.charAt(word.length() - 1);
            char c2 = word.charAt(1);
            char c3 = word.charAt(word.length() - 2);
            // swap characters 
            char tempC = c1;
            c1 = c4;
            c4 = tempC;
            tempC = c2;
            c2 = c3;
            c3 = tempC;
            // reassemble the string
            String newWord = "" + c1 + c2 + word.charAt((int)Math.floor(word.length() / 2.0)) + c3 + c4;
            // display results
            System.out.println("For the string " + word + " the reverse is " + newWord);
        }
    }
}
