package prob3.a;

public class Main {

    public static void main(String[] args) {
        double radius = 5.5, height = 2.2;
        Cylinder cylinder = new Circle(radius);

        Cylinder cylinder1 = new Cylinder(radius,height);

        //System.out.println("Volume of circle : "+cylinder.computeArea());
        System.out.println("Volume of circle : "+cylinder.computeVolume());
        System.out.println("Volume of Cylinder : "+cylinder1.computeVolume());

    }
}
