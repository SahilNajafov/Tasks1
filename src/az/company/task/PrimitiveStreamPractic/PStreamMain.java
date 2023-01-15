package az.company.task.PrimitiveStreamPractic;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PStreamMain {
    public static void main(String[] args) {
        Random random = new Random();

        IntStream limit = Stream.iterate(random.nextInt(100), i -> random.nextInt(100)).mapToInt(i -> i).limit(10);
        IntSummaryStatistics intSummaryStatistics = limit.summaryStatistics();

        System.out.println(intSummaryStatistics.getMax());
        System.out.println(intSummaryStatistics.getMin());
        System.out.println(intSummaryStatistics.getAverage());
        System.out.println(intSummaryStatistics.getSum());




    }
}
