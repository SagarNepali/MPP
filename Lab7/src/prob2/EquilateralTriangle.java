package prob2;

import java.util.Arrays;

public class EquilateralTriangle implements Polygon{

    double side;

    EquilateralTriangle(double side){
        this.side = side;
    }

    @Override
    public double[] getSides() {
        double arr[] = new double[]{side};
        return arr;
    }

}
