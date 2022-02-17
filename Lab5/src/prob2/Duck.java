package prob2;

public abstract class Duck{

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    Duck(FlyBehavior flyBehavior,QuackBehavior quackBehavior){
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
    }

    void quack(){
        quackBehavior.quack();
    }

    void swim(){
        System.out.println("Swimms");
    }

    abstract void display();

    void fly(){
        flyBehavior.fly();
    }

}
