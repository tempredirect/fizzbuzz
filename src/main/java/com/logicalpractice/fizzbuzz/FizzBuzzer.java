package com.logicalpractice.fizzbuzz;

import java.io.PrintWriter;

/**
 * A FizzBuzzer is capable of outputing the 'FizzBuzz' sequence to a PrintWriter.
 *
 * @author gareth
 */
public interface FizzBuzzer {

    /**
     * Write out the FizzBuzz sequence to the PrintWriter.
     *
     * @param limit number of lines to write, must be &gt; 0
     * @param out   required PrintWriter to output to
     */
    void writeFizzBuzzWithLimitTo(int limit, PrintWriter out);
}
