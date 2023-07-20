package org.demo;

import java.util.Arrays;
import java.util.stream.IntStream;

public class distinct {
    public static void main(String[] args) {
        int[] a = new int[]{ 0, 3, 5, 7, 3, 4, 3, 0, 0, 4 };
        IntStream distinct = Arrays.stream(a).distinct();

        distinct.forEach(System.out::print);
    }
}
