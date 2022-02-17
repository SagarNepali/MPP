package prob3;

public class Main {

    public static void main(String[] args) {

        Shape[] shapes = new Shape[]{
                new Circle(2),
                new Circle(3),
                new Rectangle(2.2,2),
                new Rectangle(3,3),
                new Triangle(4.5,2),
                new Triangle(3.1,5.4)
        };

        double sum = 0;
        for(Shape s: shapes){
            sum += s.computeArea();
        }
        System.out.println("Sum of Areas: "+sum);

    }
}
