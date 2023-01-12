package az.company.task.StreamPractic2;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamMain2 {
    public static void main(String[] args) {

//        Boolean ints = new Random().ints(0,100).peek(System.out::println).anyMatch(n->n==45);


        IntStream.iterate(0, i -> i + 1).limit(6)
                .peek(System.out::println)
                .mapToDouble(i->Math.pow(i,i-1)).forEach(System.out::println);


    }
}
