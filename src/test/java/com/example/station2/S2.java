package com.example.station2;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class S2 {

    @Test
    public void test1() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        System.setOut(out);

        Main.main(null);

        String a = baos.toString();

        assertEquals("false\n42\n3.141592\n", a);
    }
}
