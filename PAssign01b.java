import java.util.Scanner;
public class PAssign01b {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        double base = input.nextDouble();
        double height = input.nextDouble();
        double area = (base * height) / 2;
        System.out.println("A triangle with base " + base + " and height " + height + " has an area of " + area + ".");


    }
}
