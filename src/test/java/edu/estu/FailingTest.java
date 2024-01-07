package edu.estu;
import org.junit.Test;

import static org.junit.Assert.fail;

public class FailingTest {

    @Test(timeout = 1000)  // Set a timeout to avoid infinite execution
    public void testInfiniteLoop() {
        try {
            // Call the method with an infinite value
            App.infiniteLoop(Double.POSITIVE_INFINITY);
            fail("Expected an exception due to infinite loop");
        } catch (Exception expected) {
            // This catch block will be executed if the method enters an infinite loop
        }
    }
}


