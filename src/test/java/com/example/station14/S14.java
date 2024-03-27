package com.example.station14;

import org.junit.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.Assert.assertEquals;

public class S14 {

    @Test
    public void test() throws Exception {
        Class<?> cls = Class.forName("com.example.item.Item");
        Object item = cls.getDeclaredConstructors()[0].newInstance();
        Field nameField = cls.getDeclaredField("name");
        nameField.setAccessible(true);

        assertEquals("未設定", nameField.get(item));

        Method setNameMethod = cls.getDeclaredMethod("setName", String.class);
        setNameMethod.invoke(item, "名前");

        assertEquals("名前", nameField.get(item));
    }
}
