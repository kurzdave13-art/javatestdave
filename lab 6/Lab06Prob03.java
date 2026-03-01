/**
* File: Lab06Prob03.java
* Class: CSCI 1301
* Author: Dave Kurz
* Created on: Feb 1, 2026
* Last Modified: Feb 1, 2026
* Description: using while loop, enter numbers until 672 is entered, then calculate the average
*/
import java.util.Scanner;
public class Lab06Prob03 {
    public static void main(String[] args) {
        // declare a scanner
        Scanner input = new Scanner(System.in);
        // declare necessart variables
        int count = 0, value = 0, sum = 0;
        // prompt user to enter a number and 672 to quit
        System.out.println("Enter an integer (672 to quit): ");
        value = input.nextInt();

        // check if numbers and positive and even and add 1 to count 
        while (value != 672) {
            if (value > 0 && value % 2 == 0) {
                sum += value;
                count++;
            }
            System.out.println("Enter an integer (672 to quit): ");
            value = input.nextInt();
        }
        // find the average of the above code and print results
        double avg = (double) sum / count;
        System.out.printf("For the positive, even numbers, the sum was %d and the average was %.4f%n", sum, avg); 
    }
}
