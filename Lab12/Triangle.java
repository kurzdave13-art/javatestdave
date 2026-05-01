//package Lab12;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;

    private static double largestInitialArea = 0.0;

    public static double getLargestInitialArea(){
        return largestInitialArea;
    }

    // Default constructor: 3-4-5 triangle
    public Triangle() {
        this(3.0,4.0,5.0);
    }

    // Convenience constructor
    public Triangle(double sideA, double sideB, double sideC) {
        // Any non-positive value becomes 1.0
        this.setSideA(sideA);
        this.setSideB(sideB);
        this.setSideC(sideC);

        checkInitialArea();
    }
    //create getters for each side
    public double getSideA(){
        return sideA;
    }
    public double getSideB(){
        return sideB;
    }
    public double getSideC(){
        return sideC;
    }
    // create setters for all sides of triangle
    public void setSideA(double sideA){
        this.sideA = (sideA > 0) ? sideA : 1.0;
    }
    public void setSideB(double sideB){
        this.sideB = (sideB > 0) ? sideB : 1.0;
    }
    public void setSideC(double sideC){
        this.sideC = (sideC > 0) ? sideC : 1.0;
    }

    // Compute perimeter
    public double getPerimeter() {
        return this.sideA + this.sideB + this.sideC;
    }

    // Compute area using Heron's formula
    public double getArea() {
        double s = getPerimeter() / 2.0;
        return Math.sqrt(s * (s - this.sideA) * (s - this.sideB) * (s - this.sideC));
    }

    // check if area is larger than original area
    public void checkInitialArea(){
        double area = getArea();
        if(area > largestInitialArea){
            largestInitialArea = area;
        }
    }

    // Return formatted info string
    public String getInfo() {
    return String.format(
        "Side A: %5.2f\tSide B: %5.2f\tSide C: %5.2f\tArea: %5.2f\tPerimeter: %5.2f",
        this.sideA, this.sideB, this.sideC, getArea(), getPerimeter()
    );
    }   
}
