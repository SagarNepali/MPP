package prob3.b;

public class Main {

    public static void main(String[] args) {
        double radius = 5.5, height = 2.2;
        Circle circle = new Circle(radius);

        System.out.println("Area of circle: "+circle.computeArea());
        circle.getCylinder().setHeight(3.5);
        System.out.println("Volume of Cylinder: "+circle.getCylinder().computeVolume());

    }
}
