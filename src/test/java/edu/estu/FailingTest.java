package edu.estu;
import org.example.App;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

public class FailingTest {

    @Test(timeout = 1000)
    public void testInfiniteLoop() {
        try {
            App.infiniteLoop(Double.POSITIVE_INFINITY);
            assertTrue(false); // No Infinite Loop
        } catch (Throwable e) {
            assertTrue(true); // Infinite Loop
        }
    }
}



