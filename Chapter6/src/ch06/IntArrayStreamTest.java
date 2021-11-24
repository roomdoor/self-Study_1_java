package ch06;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5};

        for (int i : arr){
            System.out.println(i);
        }

        System.out.println();
        IntStream is = Arrays.stream(arr);
        is.forEach(n -> System.out.println(n));

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
//      is 다시 사용 불가능 // stream 특징
//        IntStream is = Arrays.stream(arr);
//        is. 매서드 엄청 많음 찾아서 사용하기
    }
}
