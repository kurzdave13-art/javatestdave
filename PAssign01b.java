import java.util.Scanner;
public class PAssign01b {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter base value:");
        double base = input.nextDouble();
        System.out.println("Enter height value:");
        double height = input.nextDouble();
        double area = (base * height) / 2;
        System.out.println("A triangle with base " + base + " and height " + height + " has an area of " + area + ".");


    }
}
