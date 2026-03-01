/**
* File: Lab06Prob01.java
* Class: CSCI 1301
* Author: Dave Kurz
* Created on: Feb 1, 2026
* Last Modified: Feb 1, 2026
* Description: using do-while loop enter numbers until -19.5 and display the min and max
*/
import java.util.Scanner;
public class Lab06Prob01 {
    public static void main(String[] args) {
        // import a scanner
        Scanner input = new Scanner(System.in);
        // declare necessary varibles
        double num;
        double max = Double.NEGATIVE_INFINITY;
        double min = Double.POSITIVE_INFINITY;
        boolean hasValid = false;

        // enter a number between -100 and 100 and calculate the min and max until -19.5, exclude the sentinel variable
        do {
            System.out.println("Type a decimal point value between -100.0 and 100.0");
            num = input.nextDouble();
            if (num >= -100 && num <= 100 && num != -19.5) {
                if (!hasValid){
                max = num;
                min = num;
                hasValid = true;
                }else {
                    if(num > max) max = num;
                    if(num < min) min = num;
                }
            }
        }while(num != -19.5);
        
        // print the results if there were max and min or not
        if (hasValid){
            System.out.printf("The max value was %.1f%n", max);
            System.out.printf("The min value was %.1f%n", min);
        }else {
            System.out.println("There were no valid values");
        }
     }
}
