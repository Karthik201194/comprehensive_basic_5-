package com.packtpub.maven;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.Assert.assertEquals;

/**
 * Unit test for simple Hello.
 */
public class HelloTest {

    private PrintStream savedOut;
    private static final String NEW_LINE = System.getProperty("line.separator");

    @Before
    public void setUp() {
        savedOut = System.out;
    }

    @After
    public void tearDown() {
        System.setOut(savedOut);
    }

    @Test
    public void programSaysHello() {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream stream = new PrintStream(baos);
        System.setOut(stream);

        Hello.main();
        assertEquals("Hello, World!" + NEW_LINE, baos.toString());
    }
}
