package com.logicalpractice.fizzbuzz;

import java.io.PrintWriter;

/**
 * @author gareth
 */
public class JavaFizzBuzzer implements FizzBuzzer {

    public void writeFizzBuzzWithLimitTo(int limit, PrintWriter out) {
        for(int i = 1; i <= limit ; i ++){
            out.println(i);
        }
    }
}
