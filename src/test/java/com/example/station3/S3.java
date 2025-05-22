package com.example.station3;

import static org.junit.Assert.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.junit.Test;

public class S3 {

    @Test
    public void test1() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream out = new PrintStream(baos);
        System.setOut(out);

        Main.main(null);

        String output = baos.toString();

        List<String> condition = Arrays.asList(
            "/^^^^^^^^^^^\\",
            "|\"TechTrain\"|",
            "\\___________/"
        );
        String regex = condition.stream()
                .map(Pattern::quote)
                .collect(Collectors.joining("\\R", "", "\\R"));

        assertTrue(Pattern.compile(regex).matcher(output).matches());
    }
}
