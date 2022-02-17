package prob1.b;

import java.util.function.Supplier;

public class MethodReference {

    class InnerClass implements Supplier<Double>{

        @Override
        public Double get() {
            return supplier.get();
        }
    }

    //i
    static Supplier<Double> supplier = () ->  Math.random();

    public static void main(String[] args) {
        //ii
        System.out.println(MethodReference.supplier.get());

        //iii
        System.out.println(new MethodReference().new InnerClass().get());


    }
}
