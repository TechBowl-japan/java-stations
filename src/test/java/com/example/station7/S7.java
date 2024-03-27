package com.example.station7;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class S7 {

    @Test
    public void test1() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        System.setOut(out);

        Main.main(null);

        String a = baos.toString();

        assertEquals("39.2\n", a);
    }
}
