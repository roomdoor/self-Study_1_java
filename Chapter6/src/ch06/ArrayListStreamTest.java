package ch06;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {
    public static void main(String[] args) {

        List<String> sList = new ArrayList<>();
        sList.add("Lee");
        sList.add("Kimm");
        sList.add("Parkkk");
        sList.add("Na");

        Stream<String> stream = sList.stream();
        stream.forEach(s -> System.out.print(s + "\t"));
        System.out.println();

        sList.stream().sorted().forEach(s -> System.out.print(s + "\t"));
        System.out.println();

        sList.stream().map(s -> s.length()).forEach(s -> System.out.print(s + "\t"));
        System.out.println();

        sList.stream().filter(s -> s.length() > 3).forEach(s -> System.out.print(s + "\t"));
    }
}
