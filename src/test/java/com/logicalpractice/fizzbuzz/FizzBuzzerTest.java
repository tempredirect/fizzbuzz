package com.logicalpractice.fizzbuzz;

import org.junit.Test;

import java.io.PrintWriter;
import java.io.StringWriter;

import static org.hamcrest.Matchers.equalTo;
import static org.junit.Assert.assertThat;

/**
 * @author gareth
 */
public class FizzBuzzerTest {

    FizzBuzzer testObject = new JavaFizzBuzzer();

    // method name convention <name of method>_<test scenario>_<expectation>

    @Test(expected = IllegalArgumentException.class)
    public void writeFizzBuzzWithLimitTo_withZeroLimit_expectIllegalArgException() {
        testObject.writeFizzBuzzWithLimitTo(0, new PrintWriter(System.out));
    }

    @Test(expected = IllegalArgumentException.class)
    public void writeFizzBuzzWithLimitTo_withNegativeLimit_expectIllegalArgException() {
        testObject.writeFizzBuzzWithLimitTo(-1021, new PrintWriter(System.out));
    }

    @SuppressWarnings({"NullableProblems"})
    @Test(expected = IllegalArgumentException.class)
    public void writeFizzBuzzWithLimitTo_withNullPrintWriter_expectIllegalArgException() {
        testObject.writeFizzBuzzWithLimitTo(10, null);
    }

    @Test
    public void writeFizzBuzzWithLimitTo_with10Items_expect10Lines() {

        StringWriter output = new StringWriter();
        testObject.writeFizzBuzzWithLimitTo(10, new PrintWriter(output));

        String[] lines = output.toString().split("\\n");

        assertThat(lines.length, equalTo(10));
    }

    @Test
    public void writeFizzBuzzWithLimitTo_with9Items_expectEveryThirdItemFizz() {

        StringWriter output = new StringWriter();
        testObject.writeFizzBuzzWithLimitTo(9, new PrintWriter(output));

        String[] lines = output.toString().split("\\n");

        // zero based arrays make this a little harder to read
        assertThat(lines[2], equalTo("Fizz"));
        assertThat(lines[5], equalTo("Fizz"));
        assertThat(lines[8], equalTo("Fizz"));
    }

    @Test
    public void writeFizzBuzzWithLimitTo_with10Items_expectBuzzAtFiveAndTen() {

        StringWriter output = new StringWriter();
        testObject.writeFizzBuzzWithLimitTo(10, new PrintWriter(output));

        String[] lines = output.toString().split("\\n");

        assertThat(lines[4], equalTo("Buzz"));
        assertThat(lines[9], equalTo("Buzz"));
    }


    @Test
    public void writeFizzBuzzWithLimitTo_with15Items_expectFizzBuzzAt15() {

        StringWriter output = new StringWriter();
        testObject.writeFizzBuzzWithLimitTo(15, new PrintWriter(output));

        String[] lines = output.toString().split("\\n");

        assertThat(lines[14], equalTo("FizzBuzz"));
    }


}
