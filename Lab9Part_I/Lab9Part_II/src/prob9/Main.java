package prob9;

import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    static IntUnaryOperator op = (n) -> n*n;

    public static void printSquares(int num){
        IntStream.iterate(1,n -> {
            n = n+1;
            return op.applyAsInt(n);
        }).limit(num).forEach(System.out::println);



    }

    public static void main(String[] args) {
        Main.printSquares(4);
    }
}