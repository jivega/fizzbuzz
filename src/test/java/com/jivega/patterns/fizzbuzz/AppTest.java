package com.jivega.patterns.fizzbuzz;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    @Test
    public void testGetMessage(){
        int i = 15;
        int j = 16;
        int k = 20;
        int l = 21;
        int m = 31;
        int n = 51;
        int o = 53;

        String messageBizzBuzz = "BizzBuzz";
        String messageBizz = "Bizz";
        String messageBuzz = "Buzz";
        Assert.assertTrue(messageBizzBuzz.equals(App.getMessage(i)));
        Assert.assertTrue(messageBizz.equals(App.getMessage(l)));
        Assert.assertTrue(messageBuzz.equals(App.getMessage(k)));
        Assert.assertTrue(Integer.valueOf(j).toString().equals(App.getMessage(j)));
        Assert.assertTrue(messageBizz.equals(App.getMessage(m)));
        Assert.assertTrue(messageBizzBuzz.equals(App.getMessage(n)));
        Assert.assertTrue(messageBizzBuzz.equals(App.getMessage(o)));

    }
}
