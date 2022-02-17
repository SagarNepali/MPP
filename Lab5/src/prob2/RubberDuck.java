package prob2;

public class RubberDuck extends Duck {
    RubberDuck() {
        super(new CannotFly(),new Squeak());
    }

    @Override
    void display() {
        System.out.println("displaying");
    }
}
