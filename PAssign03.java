/**
* File: PAssign03.java
* Class: CSCI 1301
* Author: David Kurz
* Created on: February 13, 2026
* Last Modified: February 13, 2026
* Description: The program takes orders of beverages and sandwiches and outputs the total with and without tax
*/
import java.util.Scanner;
public class PAssign03 {
    public static void main(String[] args) {
        // enter price for sandwiches and beverages
        double beveragesPrice = 0.50;
        double sandwichesPrice = 2.75;
        //  create a scanner object
        Scanner input = new Scanner(System.in);
        // prompt user to enter number of beverages
        System.out.println("Enter the number of beverages purchased:");
        // have the user input the number 
        double numberOfBeverages = input.nextDouble();
        // check the number of beverages is greater than 0, if not have them enter new number
        if (numberOfBeverages > 0) {
            System.out.println("Ordered: " + numberOfBeverages + " beverages");
        }else {
            System.out.println("ERROR: A quantity of 0 is not allowed.");
            System.out.println("Enter the number of beverages purchased:");
            numberOfBeverages = input.nextDouble();
            System.out.println("Ordered: " + numberOfBeverages + " beverages");
        }
        // check the number of sandwiches is greater than 0, if not have them enter a new number
        System.out.println("Enter the number of sandwiches purchased:");
        double numberOfSandwiches = input.nextDouble();
        if (numberOfSandwiches > 0) {
            System.out.println("Ordered: " + numberOfSandwiches + " sandwiches");
        }else {
            System.out.println("ERROR: A quantity of 0 is not allowed.");
            System.out.println("Enter the number of beverages purchased:");
            numberOfSandwiches = input.nextDouble();
            System.out.println("Ordered: " + numberOfSandwiches + " sandwiches");
        }
        // calculate the sub total and total with tax
        double totalBeveragePrice = beveragesPrice * numberOfBeverages;
        double totalSandwichPrice = sandwichesPrice * numberOfSandwiches;
        double total = totalBeveragePrice + totalSandwichPrice;
        double totalWithTax = total * 1.075;
        // check if number of beverages and sanwiches are both greater than 0
        if (numberOfBeverages > 0 && numberOfSandwiches > 0) {
            System.out.println("The subtotal of " + numberOfBeverages + " beverages and " + numberOfSandwiches + " sandwiches is $" + total + ".");
            System.out.println("With tax, the total is $" + totalWithTax + ".");
        }else {
            System.out.println("Your order total could not be calculated due to a zero quantity for an item.");
        }
    }
}
