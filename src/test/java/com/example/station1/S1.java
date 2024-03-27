package com.example.station1;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.Test;

public class S1 {

    @Test
    public void test1() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        System.setOut(out);

        Main.main(null);

        String a = baos.toString();

        assertEquals("Hello TechTrain!\n", a);
    }
}
