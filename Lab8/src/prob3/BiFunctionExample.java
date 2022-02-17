package prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class BiFunctionExample {

    static BiFunction<Double,Double, List<Double>> listBiFunction = (x,y) -> {
        List<Double> list = new ArrayList<>();
        list.add(Math.pow(x,y));
        list.add(x * y);
        return list;
    };

    public static void main(String[] args) {

        listBiFunction.apply(2.0,3.0).stream().forEach(r -> System.out.println(r));
    }
}
