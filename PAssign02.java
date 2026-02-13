/**
* File: PAssign02.java 
* Class: CSCI 1301
* Author: Dave Kurz
* Created on: February 3, 2026
* Last Modified: February 8, 2026
* Description: Calculate the final grade by multiplying the current grades by the weight of the assignment.
*/
import java.util.Scanner;
public class PAssign02 {
    public static void main(String[] args) {
        // this shows how many grades go into the gradebook.
        int totalGrades = 0;
        // input scanner to have the user imput the grades
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Revel grade:");
        // have the grade mulitplied by the weights as shown in the syllabus.
        double revelGrade = input.nextDouble() * 0.10;
        // add one to the number of grades each time you add a grade number.
        totalGrades++;
        System.out.println("Enter Programming Assignments grade:");
        double programmingGrade = input.nextDouble() * 0.10;
        totalGrades++;
        System.out.println("Enter Lab grade:");
        double labGrade = input.nextDouble() * 0.10;
        totalGrades++;
        System.out.println("Enter Exam 1 grade:");
        double examOneGrade = input.nextDouble() * 0.15;
        totalGrades++;
        System.out.println("Enter Exam 2 grade:");
        double examTwoGrade = input.nextDouble() * 0.15;
        totalGrades++;
        System.out.println("Enter Exam 3 grade:");
        double examThreeGrade = input.nextDouble() * 0.15;
        totalGrades++;
        System.out.println("Enter Final Exam grade:");
        double finalExamGrade = input.nextDouble() * 0.25;
        totalGrades++;
        // print the number of grades you have
        System.out.println("There were " + totalGrades + " grades entered.");
        // add up all of your grades to calculate the final grade.
        double finalGrade = (revelGrade + programmingGrade + labGrade + examOneGrade + examTwoGrade + examThreeGrade + finalExamGrade);
        // print final grade
        System.out.println("The final grade for this course is " + finalGrade + ".");

        
    }
}
