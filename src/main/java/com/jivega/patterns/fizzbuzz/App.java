package com.jivega.patterns.fizzbuzz;

public class App {
    public static void main(String[] args) {
        for( int i = 1 ; i <= 100 ; i++){
            System.out.println(getMessage(i));
        }
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
