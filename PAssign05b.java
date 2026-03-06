/**
* File: PAssign05b.java
* Class: CSCI 1301
* Author: Dave Kurz
* Created on: Mar 6, 2026
* Last Modified: Mar 6, 2026
* Description: prompt user to enter number of grades and grades and print valid and invalid grades, lowest and highest, and all letter grades entered
*/
import java.util.Scanner;
public class PAssign05b {
    public static void main(String[] args) {
        // declare a scanner variable
        Scanner input = new Scanner(System.in);
        // declare necessary variables
        boolean isValid = false;
        int grade;
        int numGrade;
        double max = 0.0;
        double min = 100.0;
        int validCount = 0;
        int invalidCount = 0;
        
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countF = 0;
         
        // prompt user to enter a number of grades
        System.out.println("Number of Grades:");
        numGrade = input.nextInt();
        // prompt user for a grade 0-100 only for the number of grades entered before hand
        for (int i = 1; i <= numGrade; i++) {
            isValid = false;
            System.out.println("Enter grade from 0-100 (" + i + " of " + numGrade + "):");
            grade = input.nextInt();
            //check if grade is 0-100 if not print error message
            if (grade >= 0 && grade <= 100) {
                isValid = true;
            }
            if (!isValid){
                System.out.println("Error: That is not a valid score.");
                invalidCount++;
            // calculate the min and max
            }else {
                if (i == 1) {
                    min = grade;
                    max = grade;
                    validCount++;
                }else {
                    if (grade < min) min = grade;
                    if (grade > max) max = grade;
                    validCount++;
                }
                // check how many letter grades are entered
                if (grade >= 90) countA++;
                else if (grade >= 80) countB++;
                else if (grade >= 70) countC++;
                else if (grade >= 60) countD++;
                else countF++;
            }
        }
        if (validCount == 0) {
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
