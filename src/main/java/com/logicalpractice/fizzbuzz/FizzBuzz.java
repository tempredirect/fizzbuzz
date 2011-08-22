package com.logicalpractice.fizzbuzz;

import java.io.PrintWriter;

/**
 * @author gareth
 */
public class FizzBuzz {

    public static void main(String[] args) {
        new JavaFizzBuzzer().writeFizzBuzzWithLimitTo(100, new PrintWriter(System.out, true));
    }
}
