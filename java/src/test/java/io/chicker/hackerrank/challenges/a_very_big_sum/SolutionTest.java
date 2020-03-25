package io.chicker.hackerrank.challenges.a_very_big_sum;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

public class SolutionTest {

    private Solution solution = new Solution();
    private InputStream systemIn;
    private PrintStream systemOut;
    final ByteArrayOutputStream baos = new ByteArrayOutputStream();

    @BeforeMethod(alwaysRun = true)
    public void resetSystemInOut() throws UnsupportedEncodingException {
        try {
            this.systemOut = System.out;
            System.setOut(new PrintStream(this.baos, true, "UTF-8"));
        } finally {
            System.setOut(this.systemOut);
        }
    }

    private void input(String s) {
        try {
            this.systemIn = System.in;
            System.setIn(new ByteArrayInputStream(s.getBytes(Charset.forName("UTF-8"))));
        } finally {
            System.setIn(this.systemIn);
        }
    }

    @Test
    public void testMain() {
        String[] args = new String[]{};
        this.solution.main(args);
        String actualOutput = new String(this.baos.toByteArray(), StandardCharsets.UTF_8).trim();
//        assertThat(calculator.value()).isEqualTo(5);
    }
}
