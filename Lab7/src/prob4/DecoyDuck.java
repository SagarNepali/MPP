package prob4;

import prob4.Duck;
import prob4.MuteQuack;

public class DecoyDuck extends Duck implements CannotFly,MuteQuack {

    @Override
    void display() {
        System.out.println("displaying");
    }
}
