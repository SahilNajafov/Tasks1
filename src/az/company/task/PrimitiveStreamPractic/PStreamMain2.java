package az.company.task.PrimitiveStreamPractic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class PStreamMain2 {
    public static void main(String[] args) {
        List<Integer> a = List.of(1,2,2,3,4);
        List<Integer> b = List.of(2,6,4,1,2);
        List<Integer> c = List.of(1,2,4);

        Set<Integer> collect = a.stream().distinct().filter(b::contains)
                .collect(Collectors.toSet());
        System.out.println(collect);
    }
}
