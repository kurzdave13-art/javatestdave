public class WaterBottleTest {
    public static void main(String[] args){
        // first waterbottle instance
        WaterBottle w1 = new WaterBottle();
        System.out.println(w1.getInfo());
        // second waterbottle instance
        WaterBottle w2 = new WaterBottle(9.5, 1.5);
        System.out.println(w2.getInfo());
        // third waterbottle instance
        WaterBottle w3 = new WaterBottle(10.0, 2.5);
        w3.setColor("blue");
        System.out.println(w3.getInfo());
    }
}