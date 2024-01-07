package edu.estu;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

/**
 * Unit tests for the first part of the project.
 */
public class FailingTest {

    @Test
    public void testInfiniteLoop() {
        // This test intentionally enters into an infinite loop
        assertTrue("Test failed: Infinite loop not encountered", false);
    }
}

