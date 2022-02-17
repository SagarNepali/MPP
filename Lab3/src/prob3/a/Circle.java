package prob3.a;

public class Circle extends Cylinder {

    private double radius;

    public Circle(double radius){
        super(radius,0);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    double computeArea(){
        return  Math.PI * radius * radius;
    }
}
