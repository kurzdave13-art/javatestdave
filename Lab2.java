import java.util.Scanner;
public class Lab2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = Integer.parseInt(args[0]);

        Cylinder[] cylinderObjects = new Cylinder[n];

        for(int i = 0; i < cylinderObjects.length; i++){
            System.out.println("Enter information for cylinder " + (i + 1) + ":");

            System.out.print("baseRadius: ");
            double radius = input.nextDouble();

            System.out.print("height: ");
            double height = input.nextDouble();

            System.out.println();

            cylinderObjects[i] = new Cylinder(radius, height);
        }
        
        System.out.println("The cylinders you entered are:");
        for(int i = 0; i < cylinderObjects.length; i++){
            System.out.println(cylinderObjects[i].toString());
        }
    }
}
class Cylinder {
    private double baseRadius;
    private double height;

    public Cylinder() {
        this.baseRadius = 1.0;
        this.height = 1.0;
    }

    public Cylinder(double newBaseRadius, double newHeight) {
        this.baseRadius = newBaseRadius;
        this.height = newHeight;
    }

    public double getSurfaceArea() {
        return (2 * Math.PI * (baseRadius * baseRadius)) + (2 * Math.PI * baseRadius * height);
    }

    public double getVolume() {
        return Math.PI * (baseRadius * baseRadius) * height;
    }

    public String toString() {
        return "I am a cylinder object with baseRadius " + baseRadius + " and height " + height + ". I have surface area " + String.format("%.2f", getSurfaceArea()) + " and volume " + String.format("%.2f", getVolume()) + ".";
    }
}
