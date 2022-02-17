package prob2;

import java.util.Arrays;

public interface Polygon extends ClosedCurve {

    double[] getSides();


    @Override
    default double computePerimeter() {
        return Arrays.stream(getSides()).sum();
    }
}
