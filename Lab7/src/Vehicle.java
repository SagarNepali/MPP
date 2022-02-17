public class Vehicle {

    void start(){
        System.out.println("Vehicle started");
    }

    static void stop(){
        System.out.println("Vehicle stopped");
    }
}

class Car extends Vehicle{

    @Override
    void start(){
        System.out.println("Car started");

    }

    static void stop(){
        System.out.println("Car stopped");
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Car();
        vehicle.start();
    }
}