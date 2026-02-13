import java.util.Scanner;
public class PAssign03 {
    public static void main(String[] args) {
        double beveragesPrice = 0.50;
        double sandwichesPrice = 2.75;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of beverages purchased:");
        double numberOfBeverages = input.nextDouble();
        if (numberOfBeverages > 0) {
            System.out.println("Ordered: " + numberOfBeverages + " beverages");
        }else {
            System.out.println("ERROR: A quantity of 0 is not allowed.");
            System.out.println("Enter the number of beverages purchased:");
            numberOfBeverages = input.nextDouble();
            System.out.println("Ordered: " + numberOfBeverages + " beverages");
        }
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
        double totalBeveragePrice = beveragesPrice * numberOfBeverages;
        double totalSandwichPrice = sandwichesPrice * numberOfSandwiches;
        double total = totalBeveragePrice + totalSandwichPrice;
        double totalWithTax = total * 1.075;
        if (numberOfBeverages > 0 && numberOfSandwiches > 0) {
            System.out.println("The subtotal of " + numberOfBeverages + " beverages and " + numberOfSandwiches + " sandwiches is $" + total + ".");
            System.out.println("With tax, the total is " + totalWithTax + ".");
        }else {
            System.out.println("Your order total could not be calculated due to a zero quantity for an item.");
        }
    }
}
