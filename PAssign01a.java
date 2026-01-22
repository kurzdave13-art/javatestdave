
import java.util.Scanner;
public class PAssign01a {
    public static void main(String[] args) {
        double priceOfBeverages = 0.50;
        double priceOfSandwiches = 2.75;
        Scanner input = new Scanner(System.in);
        double numBeverages = input.nextDouble();
        double numSandwiches = input.nextDouble();
        double totalBeveragePrice = priceOfBeverages * numBeverages;
        double totalSandwichPrice = priceOfSandwiches * numSandwiches;
        double total = totalBeveragePrice + totalSandwichPrice;
        System.out.print("The total of " + numBeverages + " beverages and " + numSandwiches + " sandwiches is " + total + ".");

    }
}