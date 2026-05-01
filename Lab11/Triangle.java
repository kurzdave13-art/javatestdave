package Lab11;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    // Default constructor: 3-4-5 triangle
    public Triangle() {
        this.sideA = 3.0;
        this.sideB = 4.0;
        this.sideC = 5.0;
    }

    // Convenience constructor
    public Triangle(double a, double b, double c) {
        // Any non-positive value becomes 1.0
        this.sideA = (a > 0) ? a : 1.0;
        this.sideB = (b > 0) ? b : 1.0;
        this.sideC = (c > 0) ? c : 1.0;
    }

    // Compute perimeter
    public double getPerimeter() {
        return sideA + sideB + sideC;
    }

    // Compute area using Heron's formula
    public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    // Return formatted info string
    public String getInfo() {
    return String.format(
        "Side A: %7.2f\tSide B: %7.2f\tSide C: %7.2f\tArea: %7.2f\tPerimeter: %7.2f",
        sideA, sideB, sideC, getArea(), getPerimeter()
    );
    }   
}
