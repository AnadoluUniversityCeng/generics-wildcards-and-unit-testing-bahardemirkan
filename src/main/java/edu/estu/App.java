package edu.estu;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.fail;

/**
 * BIM207 Project has 2 Parts, 50 points each.
 * Part-I: Writing a failing test case to demonstrate a bug.
 * Part-II: Implement a generic method both using wildcards and type parameters.
 */
public class App {

    public static void main(String[] args) {
        System.out.println("What is the minimum of the following doubles? Can you guess!");
        List<Double> doubleList = List.of(Double.NaN, 1D, 2D, 3D, -1D, -2D);
        System.out.println("The minimum element - as returned by Collections.min() method - is " + Collections.min(doubleList));
        System.out.println("Did you correctly anticipate the actual result? Did you find the actual result awkward or unexpected?");
    }

    public static void infiniteLoop(double input) {
        if (Double.isInfinite(input)) {
            for (; ; ) ; // this is dangerous
        }
    }

    static <E extends Enum<E>> void incrementCountMapGenerics(Map<E, Integer> map, E key) {
        map.merge(key, 1, Integer::sum);
    }

    static <E extends Enum<E>> void incrementCountMapWildcard(Map<? super E, Integer> map, E key) {
        map.merge(key, 1, Integer::sum);
    }

    static <E extends Enum<E>> void incrementCountMapEnumDescG(Map<Enum.EnumDesc<E>, Integer> map, Enum.EnumDesc<E> key) {
        map.merge(key, 1, Integer::sum);
    }


    static <E extends Enum<E>> void incrementCountMapEnumDescW(Map<Enum.EnumDesc<?>, Integer> map, Enum.EnumDesc<?> key) {
        map.merge(key, 1, Integer::sum);
    }
}





