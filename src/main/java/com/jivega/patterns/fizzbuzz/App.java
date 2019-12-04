package com.jivega.patterns.fizzbuzz;

import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        IntStream.range(1, 101).forEachOrdered(i -> System.out.println(getMessage(i)));
    }

    public static String getMessage(int i) {
        String number = Integer.valueOf(i).toString();
        StringBuilder result = new StringBuilder();
        if ((i % 3 == 0) || (number.contains("3"))) {
            result.append("Bizz");
        }
        if ((i % 5 == 0) || (number.contains("5"))) {
            result.append("Buzz");
        }
        if (result.length() == 0) {
            result.append(number);
        }
        return result.toString();
    }
}
