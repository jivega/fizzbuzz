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
        String messageFizzBuzz = App.FIZZ + App.BUZZ;
        String messageFizz = App.FIZZ;
        String messageBuzz = App.BUZZ;
        Assert.assertTrue(messageFizzBuzz.equals(App.getMessage(i)));
        Assert.assertTrue(Integer.valueOf(j).toString().equals(App.getMessage(j)));
        Assert.assertTrue(messageFizz.equals(App.getMessage(l)));
        Assert.assertTrue(messageBuzz.equals(App.getMessage(k)));
        Assert.assertTrue(messageFizz.equals(App.getMessage(m)));
        Assert.assertTrue(messageFizzBuzz.equals(App.getMessage(n)));
        Assert.assertTrue(messageFizzBuzz.equals(App.getMessage(o)));

    }
}
