package com.example.station8;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class S8 {

    @Test
    public void test1() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        System.setOut(out);

        Main.main(null);

        String a = baos.toString();

        assertEquals("3488\n", a);
    }
}
