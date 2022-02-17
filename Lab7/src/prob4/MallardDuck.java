package prob4;

import prob4.Quack;

public class MallardDuck extends  Duck implements FlyWithWings,Quack {

    @Override
    void display() {
        System.out.println("display");
    }
}
