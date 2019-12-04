package com.jivega.patterns.fizzbuzz;

import java.util.stream.IntStream;

public class App {
    protected final static String FIZZ = "Fizz";
    protected final static String BUZZ = "Buzz";

    public static void main(String[] args) {
        IntStream.range(1,101).forEachOrdered( i-> System.out.println(getMessage(i)));
    }
    public static String getMessage( int i ) {
        String result ;
        if ( i % 15 == 0 ) { result = FIZZ + BUZZ;}
        else if ( i % 5 == 0 ) { result = BUZZ;}
        else if ( i % 3 == 0 ) { result = FIZZ;}
        else { result = Integer.valueOf(i).toString();}
        return result;
    }
}
