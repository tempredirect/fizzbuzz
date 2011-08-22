package com.logicalpractice.fizzbuzz;

import org.junit.Before;

/**
 * @author gareth
 */
public class ClojureFizzBuzzerTest extends FizzBuzzerSpec {

    @Before
    public void setUp() throws Exception {
        testObject = new ClojureFizzBuzzer();
    }
}
