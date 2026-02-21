package Lab5;
/**
* File: Lab05Prob04.java
* Class: CSCI 1301
* Author: Dave kurz
* Created on: Feb 20, 2026
* Last Modified: Feb 20, 2026
* Description: modify Lab problem 1's output to have the deciaml point at the second digit
*/
import java.util.Scanner;
public class Lab05Prob04 {
    public static void main(String[] args) {
        // prompt user to enter 3 lengths
        Scanner input = new Scanner(System.in);
        System.out.println("Enter one side length:");
        double sideLength1 = input.nextDouble();
        System.out.println("Enter one side length:");
        double sideLength2 = input.nextDouble();
        System.out.println("Enter one side length:");
        double sideLength3 = input.nextDouble();
        // calculate semiperimeter and area
        double semiPerimeter = (sideLength1 + sideLength2 + sideLength3) / 2.0;
        double area = Math.sqrt(semiPerimeter * ((semiPerimeter - sideLength1) * (semiPerimeter - sideLength2) * (semiPerimeter - sideLength3)));
        // display the result using print f
        System.out.printf("For side lengths of %.2f, %.2f, %.2f, the area is %.2f.", sideLength1, sideLength2, sideLength3, area);
    }
}
