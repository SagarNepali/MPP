package prob4;

public class Condo extends  Property{

    private int numFloors;

    Condo(int numFloors){
        this.numFloors = numFloors;
    }

    public double computeRent(){

      return 400 * numFloors;
    }
}
