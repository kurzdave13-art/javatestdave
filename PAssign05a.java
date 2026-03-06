/**
* File: PAssign05a.java
* Class: CSCI 1301
* Author: Dave Kurz
* Created on: Mar 6, 2026
* Last Modified: Mar 6, 2026
* Description: prompt user to enter grades until a sentinal value is given and print valid and invalid grades, lowest and highest, and all letter grades entered
*/
import java.util.Scanner;
public class PAssign05a {
    public static void main(String[] args) {
        // declare a scanner variable
        Scanner input = new Scanner(System.in);
        // declare necessary variable
        int grade;
        double max = 0.0;
        double min = 100.0;
        int validCount = 0;
        int invalidCount = 0;
        
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;

        // prompt the user to enter a grade
        System.out.println("Enter grade from 0-100, -999 to stop:");
        grade = input.nextInt();

        // keep getting input until they enter -999
        while(grade != -999) {
            // check if grade is 0-100
            if (grade >= 0 && grade <= 100) {
                validCount++;
                // calculate min and max
                if (grade < min) min = grade;
                if (grade > max) max = grade;

                // check how many letter grades were used
                if (grade >= 90) countA++;
                else if (grade >= 80) countB++;
                else if (grade >= 70) countC++;
                else if (grade >= 60) countD++;
                else countF++;
            }else {
                // if grade isn't 0-100 print error message
                System.out.println("Error: That is not a valid score.");
                invalidCount++;
            }
            // repeat until user enters -999
            System.out.println("Enter grade from 0-100, -999 to stop:");
            grade = input.nextInt();
        }
        // if none of the grades entered were valid reassign min to 0
        if(validCount == 0) {
            min = 0.0;
        }

        System.out.println();

        // print results
        System.out.println("Valid grades:\t" + validCount);
        System.out.println("Invalid grades:\t" + invalidCount);
        
        System.out.printf("Highest grade:\t%.2f%n", max);
        System.out.printf("Lowest grade:\t%.2f%n", min);

        System.out.println();

        System.out.println("As:\t" + countA);
        System.out.println("Bs:\t" + countB);
        System.out.println("Cs:\t" + countC);
        System.out.println("Ds:\t" + countD);
        System.out.println("Fs:\t" + countF);
    }
}
