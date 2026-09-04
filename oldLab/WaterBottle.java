public class WaterBottle {
    // declares used variables
    public double height;
    public double radius;
    public String color;

    // Uses default construtor to set values to circle
    public WaterBottle(){
        this.height = 12.0;
        this.radius = 2.0;
        this.color = "green";
    }

    // uses conveinence constructor to set new values
    public WaterBottle(double newHeight, double newRadius){
        this.height = newHeight;
        this.radius = newRadius;
        this.color = "green";
    }

    // sets new color of waterbottle
    public void setColor(String newColor){
        this.color = newColor;
    }

    // gets volume of waterbottle
    public double getVolume(){
        return Math.PI * (radius * radius) * height;
    }

    // returns all the information given prior
    public String getInfo(){
        return "A " + color + " water bottle with height "+ String.format("%.2f", height) + ", radius " + String.format("%.2f", radius) + ", and volume " + String.format("%.2f", getVolume()); 
    }
}