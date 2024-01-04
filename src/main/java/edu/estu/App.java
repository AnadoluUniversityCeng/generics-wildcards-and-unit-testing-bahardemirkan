package edu.estu;

import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * BIM207 Project has 2 Parts, 50 points each.
 * Part-I: Writing a failing test case to demonstrate a bug.
 * Part-II: Implement a generic method both using wildcards and type parameters.
 */
public class App {

    /**
     * A shocking quiz.
     */
    public static void main(String[] args) {
        System.out.println("What is the minimum of the following doubles? Can you guess!");
        List<Double> doubleList = List.of(Double.NaN, 1D, 2D, 3D, -1D, -2D);
        System.out.println("The minimum element - as returned by Collections.min() method - is " + Collections.min(doubleList));
        System.out.println("Did you correctly anticipate the actual result? Did you find the actual result awkward or unexpected?");
    }

    /**
     * For a certain user input(s) the function/method enters an infinite loop.
     * This is an intentional bug, do not fix it.
     * Instead, write a *failing* junit test case to demonstrate the bug.
     *
     * @param input a double value
     */
    public static void infiniteLoop(double input) {
        if (Double.isInfinite(input)) {
            for (; ; ) ; // this is dangerous
        }
    }


    /**
     * There's often a case when we can declare a generic method using either wildcards or type parameters.
     * https://www.baeldung.com/java-generics-type-parameter-vs-wildcard
     * Please implement an increment-by-one method that increments the frequency of given key by one in a count/frequency map.
     * Implement the generic method in both possible two ways (i.e. using wildcards <?> and type parameters <E>).
     * So that, pre-written test cases all pass. Do not modify the test cases.
     *
     * @param map the frequency map, keys can be any Enum (built-in or custom), values are Integer.
     * @param key any Enum type should work. Hint: How do I decrypt "Enum<E extends Enum<E>>"?
     * http://www.angelikalanger.com/GenericsFAQ/FAQSections/TypeParameters.html#FAQ106
     */


    /* **********************************************
     ******* ALL TESTS MUST PASS IN THE END *********
     **** WRITE YOUR 4 static void METHODS HERE: ****
     ************************************************
     */

    /**
     * Hint: Map.merge() - One method to rule them all
     * https://nurkiewicz.com/2019/03/mapmerge-one-method-to-rule-them-all.html
     */
    static <> void {
    }

    static void {
    }

    static <> void {
    }

    static void {
    }
}

