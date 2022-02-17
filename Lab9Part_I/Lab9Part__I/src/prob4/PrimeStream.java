package prob4;

import java.math.BigInteger;
import java.util.function.IntPredicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeStream {


    //B
    void printFirstNPrimeNumbers(long n){

        final Stream<BigInteger> primes = Stream.iterate(BigInteger.TWO, BigInteger::nextProbablePrime).limit(n);
        primes.forEach(System.out::println);

    }

    public static void main(String[] args) {

        System.out.println("Infinite");
//        new A().primes.forEach(System.out::println);

        System.out.println("Limited");
        PrimeStream ps = new PrimeStream(); //PrimeStream is enclosing class
        ps.printFirstNPrimeNumbers(10);
        System.out.println("====");
        ps.printFirstNPrimeNumbers(5);
    }
}
