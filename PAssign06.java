/**
* File: PAssign06.java
* Class: CSCI 1301
* Author: Dave Kurz
* Created on: Mar 10, 2026
* Last Modified: Mar 10, 2026
* Description: create 4 loops that print multiples of 5 depending on user input
*/
import java.util.Scanner;

public class PAssign06 {
    public static void main(String[] args) {
        // declare scanner variable
        Scanner input = new Scanner(System.in);
        // declare the number of variables and prompt the user to enter one
        int numMultiples;
        System.out.println("Enter max number of multiples:");
        numMultiples = input.nextInt();

        // if the number entered is negative keep asking user until they input a positive number
        while(numMultiples <= 0){
            System.out.println("Please enter a positive value.");
            System.out.println();
            System.out.println("Enter max number of multiples:");
            numMultiples = input.nextInt();
        }
        
        System.out.println();
        
        // print an ascending triangle with ascending multiples of 5
        System.out.println("Pattern A:");
        for(int i = 1; i <= numMultiples; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j * 5 + " ");
            }
            System.out.println();
        }
       
       System.out.println();
       
        // print a descending triangle with ascending multiples of 5
        System.out.println("Pattern B:");
        for(int i = numMultiples; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j * 5 + " ");
            }
            System.out.println();
        }

        System.out.println();
        
        // print an ascending triangle with descending multiples of 5
        System.out.println("Pattern C:");
        for(int i = 1; i <= numMultiples; i++) {
            for(int j = i; j >= 1; j--){
                System.out.print(j * 5 + " ");
            }
            System.out.println();
        }

        System.out.println();
        
        // print a descending triangle with descending multiples of 5
        System.out.println("Pattern D:");
        for(int i = numMultiples; i >= 1; i--) {
            for(int j = i; j >= 1; j--) {
                System.out.print(j * 5 + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}