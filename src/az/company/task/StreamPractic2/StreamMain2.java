package az.company.task.StreamPractic2;

import java.util.Random;
import java.util.stream.IntStream;

public class StreamMain2 {
    public static void main(String[] args) {

        Boolean ints = new Random().ints(0,100).peek(System.out::println).anyMatch(n->n==45);
    }
}
