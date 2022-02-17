package prob4;

import prob4.FlyBehavior;
import prob4.QuackBehavior;

public abstract class Duck implements FlyBehavior,QuackBehavior{

    void swim(){
        System.out.println("Swimms");
    }

    abstract void display();


}
