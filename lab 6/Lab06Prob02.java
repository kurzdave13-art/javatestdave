
/**
* File: Lab06Prob02.java
* Class: CSCI 1301
* Author: Dave Kurz
* Created on: Feb 1, 2026
* Last Modified: Feb 1, 2026
* Description: calculate the sum using for loop
*/
public class Lab06Prob02 {
    public static void main(String[] args) {
        // safer to use long because the answer is large
        long sum = 0;
        // check if i is less than 250 and calculate sum, add 1 to i everytime
        for (int i = 5; i <= 250; i++) {
            sum += ((2L * i) + 1) * ((2L * i) + 1);
        }
        // print sum
        System.out.printf("The sum is %,d%n", sum);
    }
}
