package org.demo;

import java.util.Arrays;

public class sum {
    public static void main(String[] args) {
        int[] a = new int[]{ 0, 3, 5, 7, 3, 4, 3, 0, 0, 4 };
        System.out.println(Arrays.stream(a).sum());
    }
}
