package prob4;

public class House extends Property{

    public double lotSize;

    House(double lotSize){
        this.lotSize = lotSize;
    }

    public double computeRent(){
      return 0.1 * lotSize;
    }
}
