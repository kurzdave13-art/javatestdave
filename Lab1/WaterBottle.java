public class WaterBottle {
    public double height;
    public double radius;
    public String color;

    public WaterBottle(){
        this.height = 12.0;
        this.radius = 2.0;
        this.color = "green";
    }

    public WaterBottle(double newHeight, double newRadius){
        this.height = newHeight;
        this.radius = newRadius;
        this.color = "green";
    }

    public void setColor(String newColor){
        this.color = newColor;
    }

    public double getVolume(){
        return Math.PI * (radius * radius) * height;
    }

    public String getInfo(){
        return "A " + color + " water bottle with height "+ String.format("%.2f", height) + ", radius " + String.format("%.2f", radius) + ", and volume " + String.format("%.2f", getVolume()); 
    }
}