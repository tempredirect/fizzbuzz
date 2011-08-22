package com.logicalpractice.fizzbuzz;

import java.io.PrintWriter;

/**
 * @author gareth
 */
public class JavaFizzBuzzer implements FizzBuzzer {

    public void writeFizzBuzzWithLimitTo(int limit, PrintWriter out) {
        if (limit < 1) {
            throw new IllegalArgumentException("Limit must be a positive integer [" + limit + "]");
        }
        if (out == null) {
            throw new IllegalArgumentException("A print writers is required");
        }

        for (int i = 1; i <= limit; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                out.println("Fizz");
            } else if (i % 5 == 0) {
                out.println("Buzz");
            } else {
                out.println(i);
            }
        }
    }
}
