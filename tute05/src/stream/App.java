package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<String> strings = List.of("1", "2", "3", "4", "5");

        strings.stream().forEach(s -> System.out.println(s));

        strings.stream().forEach(s -> {
            System.out.println(s);
        });

        List<String> strings2 = List.of("1", "2", "3", "4", "5");
        

        // List<Integer> ints = strings2.stream().map(s -> Integer.parseInt(s)).collect(Collectors.toList());
        // Q3, these lines do the exact same thing
        List<Integer> ints = strings2.stream().map(Integer::parseInt).collect(Collectors.toList());

        System.out.println(ints);
    }
}
