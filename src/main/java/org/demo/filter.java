package org.demo;

import java.util.List;

public class filter {
    public static void main(String[] args) {
        List<String> names = List.of("ennui", "gochi", "nuli");
        List<String> list = names.stream().filter(s -> s.length() >= 5).toList();

        list.forEach(System.out::println);
    }
}
