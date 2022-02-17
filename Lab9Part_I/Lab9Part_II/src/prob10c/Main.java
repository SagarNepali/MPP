package prob10c;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        IntSummaryStatistics intStream = Stream.of(1,2,3,4,5).collect(Collectors.summarizingInt(Integer::intValue));
        System.out.println("MAX: "+intStream.getMax());
        System.out.println("Min: "+intStream.getMin());
    }
}
