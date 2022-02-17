package prob3.b;

public class Circle {

    private double radius;
    private Cylinder cylinder;

    public Circle(double radius){
        this.cylinder = new Cylinder(radius,0);
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    double computeArea(){
        return  Math.PI * radius * radius;
    }

    public Cylinder getCylinder() {
        return cylinder;
    }
}
