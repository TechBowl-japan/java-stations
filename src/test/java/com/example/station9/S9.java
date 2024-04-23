package com.example.station9;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class S9 {

    @Test
    public void test1() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        System.setOut(out);
        String br = System.getProperty("line.separator");

        Main.test(new int[]{100, 200});
        Main.test(new int[]{1200, 1500, 1400});
        Main.test(new int[]{1200, 1500, 1400, 1000, 1500});
        Main.test(new int[]{2000, 1900, 5000});

        String a = baos.toString();

        assertEquals("A" + br + "A" + br + "B" + br + "C" + br, a);
    }
}
