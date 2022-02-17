package prob3.b;

public class Cylinder {

    private double height;
    private double radius;

    Cylinder(double radius, double height){
        this.radius = radius;
        this.height = height;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double computeVolume(){
        return Math.PI * radius * radius * height;
    }
}
