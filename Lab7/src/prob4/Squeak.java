package prob4;

import prob4.QuackBehavior;

public interface Squeak extends QuackBehavior {
    @Override
    default public void quack() {
        System.out.println("Quacking by squeaking");
    }
}
