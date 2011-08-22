package com.logicalpractice.fizzbuzz;

import org.junit.Test;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Arrays;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author gareth
 */
public class FizzBuzzerTest {

    FizzBuzzer testObject = new JavaFizzBuzzer();

    // method name convention <name of method>_<test>_<expectation>

    @Test
    public void writeFizzBuzzWithLimitTo_with10Items_expect10Lines() throws IOException {

        StringWriter output = new StringWriter();
        testObject.writeFizzBuzzWithLimitTo(10, new PrintWriter(output));

        String [] lines = output.toString().split("\\n");

        assertThat(lines.length, equalTo(10));
    }

    @Test
    public void writeFizzBuzzWithLimitTo_with9Items_expectEveryThirdItemFizz() throws IOException {

        StringWriter output = new StringWriter();
        testObject.writeFizzBuzzWithLimitTo(9, new PrintWriter(output));

        String [] lines = output.toString().split("\\n");

        // zero based arrays make this a little harder to read
        assertThat(lines[2], equalTo("Fizz"));
        assertThat(lines[5], equalTo("Fizz"));
        assertThat(lines[8], equalTo("Fizz"));
    }

    @Test
    public void writeFizzBuzzWithLimitTo_with10Items_expectBuzzAtFiveAndTen() throws IOException {

        StringWriter output = new StringWriter();
        testObject.writeFizzBuzzWithLimitTo(10, new PrintWriter(output));

        String [] lines = output.toString().split("\\n");

        assertThat(lines[4], equalTo("Fizz"));
        assertThat(lines[9], equalTo("Fizz"));
    }


    @Test
    public void writeFizzBuzzWithLimitTo_with15Items_expectFizzBuzzAt15() throws IOException {

        StringWriter output = new StringWriter();
        testObject.writeFizzBuzzWithLimitTo(15, new PrintWriter(output));

        String [] lines = output.toString().split("\\n");

        assertThat(lines[14], equalTo("FizzBuzz"));
    }


}
