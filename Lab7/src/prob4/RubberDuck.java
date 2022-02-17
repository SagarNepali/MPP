package prob4;

public class RubberDuck extends Duck implements CannotFly,Squeak {

    @Override
    void display() {
        System.out.println("displaying");
    }
}
