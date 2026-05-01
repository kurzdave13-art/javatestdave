package Lab11;

public class TestTriangle {
    public static void main(String[] args) {
        // creates three triangle object
        Triangle t1 = new Triangle();
        Triangle t2 = new Triangle(6.4, 8.7, 10.2);
        Triangle t1 = new Triangle(-5, -10, -15);

        // prints tghe info given in triangle class
        System.out.println(t1.getInfo);
        System.out.println(t2.getInfo);
        System.out.println(t3.getInfo);
    }
}
