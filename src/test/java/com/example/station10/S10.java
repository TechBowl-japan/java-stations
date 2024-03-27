package com.example.station10;

import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class S10 {

    @Test
    public void test() throws Exception {
        Method method = Main.class.getDeclaredMethod("applyTaxAndShippingFee", int.class);
        Main main = new Main();
        assertEquals(3080, (float) method.invoke(main, 2000), 0.1);
        assertEquals(6380, (float) method.invoke(main, 5000), 0.1);
        assertEquals(11878.9, (float) method.invoke(main, 9999), 0.01);
        assertEquals(11000, (float) method.invoke(main, 10000), 0.01);
        assertEquals(22000, (float) method.invoke(main, 20000), 0.01);
    }
}
