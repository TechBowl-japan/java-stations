package com.example.station15;

import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class S15 {
    @Test
    public void test() throws Exception {
        Class<?> cls = Class.forName("com.example.coupon.CouponCalculator");
        Object calculator = cls.getDeclaredConstructors()[0].newInstance();

        Method method = cls.getDeclaredMethod("findBestCoupon", int[].class);

        Object value1 = method.invoke(calculator, new int[]{100, 200});
        Object value2 = method.invoke(calculator, new int[]{1200, 1500, 1400});
        Object value3 = method.invoke(calculator, new int[]{1200, 1500, 1400, 1000, 1500});
        Object value4 = method.invoke(calculator, new int[]{2000, 1900, 5000});

        assertEquals("A", value1);
        assertEquals("A", value2);
        assertEquals("B", value3);
        assertEquals("C", value4);
    }

    @Test
    public void testA() throws Exception {
        Class<?> cls = Class.forName("com.example.coupon.CouponA");
        Object calculator = cls.getDeclaredConstructors()[0].newInstance();

        Method method = cls.getDeclaredMethod("calculate", int[].class);

        Object value1 = method.invoke(calculator, new int[]{100, 200});
        Object value2 = method.invoke(calculator, new int[]{1200, 1500, 1400});
        Object value3 = method.invoke(calculator, new int[]{1200, 1500, 1400, 1000, 1500});
        Object value4 = method.invoke(calculator, new int[]{2000, 1900, 5000});

        assertEquals(300f, (float) value1, 0.1f);
        assertEquals(4100f, (float) value2, 0.1f);
        assertEquals(6600f, (float) value3, 0.1f);
        assertEquals(8900f, (float) value4, 0.1f);
    }

    @Test
    public void testB() throws Exception {
        Class<?> cls = Class.forName("com.example.coupon.CouponB");
        Object calculator = cls.getDeclaredConstructors()[0].newInstance();

        Method method = cls.getDeclaredMethod("calculate", int[].class);

        Object value1 = method.invoke(calculator, new int[]{100, 200});
        Object value2 = method.invoke(calculator, new int[]{1200, 1500, 1400});
        Object value3 = method.invoke(calculator, new int[]{1200, 1500, 1400, 1000, 1500});
        Object value4 = method.invoke(calculator, new int[]{2000, 1900, 5000});

        assertEquals(1070f, (float) value1, 0.1f);
        assertEquals(4490f, (float) value2, 0.1f);
        assertEquals(5940f, (float) value3, 0.1f);
        assertEquals(8010f, (float) value4, 0.1f);
    }

    @Test
    public void testC() throws Exception {
        Class<?> cls = Class.forName("com.example.coupon.CouponC");
        Object calculator = cls.getDeclaredConstructors()[0].newInstance();

        Method method = cls.getDeclaredMethod("calculate", int[].class);

        Object value1 = method.invoke(calculator, new int[]{100, 200});
        Object value2 = method.invoke(calculator, new int[]{1200, 1500, 1400});
        Object value3 = method.invoke(calculator, new int[]{1200, 1500, 1400, 1000, 1500});
        Object value4 = method.invoke(calculator, new int[]{2000, 1900, 5000});

        assertEquals(1100f, (float) value1, 0.1f);
        assertEquals(4900f, (float) value2, 0.1f);
        assertEquals(6600f, (float) value3, 0.1f);
        assertEquals(7500f, (float) value4, 0.1f);
    }
}
