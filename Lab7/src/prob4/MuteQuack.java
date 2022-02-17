package prob4;

import prob4.QuackBehavior;

public interface MuteQuack extends QuackBehavior {
    @Override
    default public void quack() {
        System.out.println("Cannot quack.isMute");
    }
}
