/**
* File: Lab05Prob01.java
* Class: CSCI 1301
* Author: Dave Kurz
* Created on: Feb 20, 2026
* Last Modified: Feb 20, 2026
* Description: calculate the area of a triangle
*/
import java.util.Scanner;
public class Lab05Prob01 {
    public static void main(String[] args) {
        // prompt user to get 3 side lengths
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
        // display results
        System.out.println("For side lengths of " + sideLength1 + ", " + sideLength2 + ", " + sideLength3 + ", the area is " + area + ".");
    }
}
