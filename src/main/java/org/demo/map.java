package org.demo;

import java.util.Arrays;
import java.util.stream.IntStream;

public class map {
    public static void main(String[] args) {
        int[] a = new int[]{ 0, 3, 5, 7, 3, 4, 3, 0, 0, 4 };
        IntStream stream = Arrays.stream(a).map(x -> x * x);

        stream.forEach(System.out::print);
    }
}
