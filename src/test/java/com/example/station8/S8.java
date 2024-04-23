package com.example.station8;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

public class S8 {

    @Test
    public void test1() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        System.setOut(out);
        String br = System.getProperty("line.separator");

        Main.question1(1000);
        assertEquals("送料800円を追加します" + br + "1800" + br, baos.toString());
        baos.reset();

        Main.question1(9000);
        assertEquals("送料800円を追加します" + br + "9800" + br, baos.toString());
        baos.reset();

        Main.question1(9999);
        assertEquals("送料800円を追加します" + br + "10799" + br, baos.toString());
        baos.reset();

        Main.question1(10000);
        assertEquals("10000" + br, baos.toString());
        baos.reset();

        Main.question1(20000);
        assertEquals("20000" + br, baos.toString());
        baos.reset();
    }

    @Test
    public void test2() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        System.setOut(out);
        String br = System.getProperty("line.separator");

        Main.question2(1);
        assertEquals("食品" + br, baos.toString());
        baos.reset();

        Main.question2(2);
        assertEquals("家電" + br, baos.toString());
        baos.reset();

        Main.question2(3);
        assertEquals("家具" + br, baos.toString());
        baos.reset();

        Main.question2(99);
        assertEquals("その他" + br, baos.toString());
        baos.reset();

        Main.question2(100);
        assertEquals("", baos.toString());
        baos.reset();

        Main.question2(4);
        assertEquals("", baos.toString());
        baos.reset();
    }
}
