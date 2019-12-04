package com.jivega.patterns.fizzbuzz;

import java.util.stream.IntStream;

public class App {
    public static void main(String[] args) {
        IntStream.range(1,101).forEachOrdered( i-> System.out.println(getMessage(i)));
    }
    public static String getMessage( int i ) {
        String result ;
        if ( i % 15 == 0 ) { result = "BizzBuzz";}
        else if ( i % 5 == 0 ) { result = "Buzz";}
        else if ( i % 3 == 0 ) { result = "Bizz";}
        else { result = Integer.valueOf(i).toString();}
        return result;
    }
}
