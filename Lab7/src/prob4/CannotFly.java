package prob4;

import prob4.FlyBehavior;

public interface CannotFly extends FlyBehavior {

    default void fly() {
        System.out.println("cannot fly");
    }
}
