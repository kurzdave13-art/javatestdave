//package Lab12;

public class TriangleTest {
    public static Triangle copyTriangle(Triangle original) {
        double newA = original.getSideA() * 2;
        double newB = original.getSideB() * 2;
        double newC = original.getSideC() * 2;

        return new Triangle(newA, newB, newC);
    }
    public static void main(String[] args) {

        // Default triangle
        Triangle t1 = new Triangle();

        // Triangle with given sides
        Triangle t2 = new Triangle(6.4, 8.7, 10.2);

        // Triangle with all negative sides
        Triangle t3 = new Triangle(-5, -10, -2);

        Triangle t4 = new Triangle(14.9,18.5,12.10);

        Triangle[] triangles = {t1,t4,t2,t3};

        for(Triangle tri: triangles){
            System.out.println(tri.getInfo());
        }
        System.out.printf("\nLargest Initial Area: %.2f\n",Triangle.getLargestInitialArea());
        
        Triangle doubled = new TriangleTest.copyTriangle(t2);
        System.out.println("\nDoubled Triangle:");
        System.out.println(doubled.getInfo());
    }
}
