package org.demo;

import java.util.List;

public class limit {
    public static void main(String[] args) {
        List<String> names = List.of("ennui", "gochi", "nuli");
        List<String> list = names.stream().limit(1).toList();

        list.forEach(System.out::println);
    }
}
