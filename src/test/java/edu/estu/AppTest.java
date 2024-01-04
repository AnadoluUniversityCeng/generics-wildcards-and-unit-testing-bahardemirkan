package edu.estu;

import org.junit.Test;

import java.lang.constant.ClassDesc;
import java.time.Month;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

/* ********************************************
 **** ATTENTION: DO NOT MODIFY THIS FILE! *****
 **********************************************
 */

/**
 * Unit tests for the second part of the project.
 */
public class AppTest {

    @Test
    public void testIncrementCountMapGenerics1() {
        Map<Month, Integer> map = new HashMap<>();
        App.incrementCountMapGenerics(map, Month.NOVEMBER);
        App.incrementCountMapGenerics(map, Month.NOVEMBER);

        assertEquals(1, map.size());
        assertFalse(map.isEmpty());

        assertTrue(map.containsKey(Month.NOVEMBER));
        assertTrue(map.containsValue(2));
        assertFalse(map.containsValue(0));
    }


    @Test
    public void testIncrementCountMapWildcard1() {
        Map<Enum<?>, Integer> map = new HashMap<>();
        App.incrementCountMapWildcard(map, Month.NOVEMBER);
        App.incrementCountMapWildcard(map, Month.NOVEMBER);

        assertEquals(1, map.size());
        assertFalse(map.isEmpty());
        assertTrue(map.containsKey(Month.NOVEMBER));
        assertTrue(map.containsValue(2));
        assertFalse(map.containsValue(0));
    }


    @Test
    public void testIncrementCountMapGenerics2() {
        EnumMap<Month, Integer> map = new EnumMap<>(Month.class);
        App.incrementCountMapGenerics(map, Month.NOVEMBER);
        App.incrementCountMapGenerics(map, Month.NOVEMBER);

        assertEquals(1, map.size());
        assertFalse(map.isEmpty());
        assertTrue(map.containsKey(Month.NOVEMBER));
        assertTrue(map.containsValue(2));
        assertFalse(map.containsValue(0));
    }

    @Test
    public void testIncrementCountMapWildcard2() {

        EnumMap<?, Integer> map = new EnumMap<>(Month.class);
        Map<Enum<?>, Integer> mm = (Map<Enum<?>, Integer>) map;

        App.incrementCountMapWildcard(mm, Month.NOVEMBER);
        App.incrementCountMapWildcard(mm, Month.NOVEMBER);

        assertEquals(1, map.size());
        assertFalse(map.isEmpty());
        assertTrue(map.containsKey(Month.NOVEMBER));
        assertTrue(map.containsValue(2));
        assertFalse(map.containsValue(0));
    }

    enum Direction {
        NORTH, SOUTH, EAST, WEST
    }

    @Test
    public void testIncrementCountMapGenerics3() {
        Map<Direction, Integer> map = new HashMap<>();
        App.incrementCountMapGenerics(map, Direction.WEST);
        App.incrementCountMapGenerics(map, Direction.SOUTH);

        assertEquals(2, map.size());
        assertFalse(map.isEmpty());

        assertTrue(map.containsKey(Direction.WEST));
        assertTrue(map.containsKey(Direction.SOUTH));
        assertFalse(map.containsKey(Direction.EAST));
        assertFalse(map.containsKey(Direction.NORTH));
        assertTrue(map.containsValue(1));
        assertFalse(map.containsValue(0));
    }

    @Test
    public void testIncrementCountMapWildcard3() {
        Map<Enum<?>, Integer> map = new HashMap<>();
        App.incrementCountMapWildcard(map, Direction.WEST);
        App.incrementCountMapWildcard(map, Direction.SOUTH);

        assertEquals(2, map.size());
        assertFalse(map.isEmpty());

        assertTrue(map.containsKey(Direction.WEST));
        assertTrue(map.containsKey(Direction.SOUTH));
        assertFalse(map.containsKey(Direction.EAST));
        assertFalse(map.containsKey(Direction.NORTH));
        assertTrue(map.containsValue(1));
        assertFalse(map.containsValue(0));
    }


    @Test
    public void testIncrementCountMapGenerics4() {
        EnumMap<Direction, Integer> map = new EnumMap<>(Direction.class);
        App.incrementCountMapGenerics(map, Direction.WEST);
        App.incrementCountMapGenerics(map, Direction.SOUTH);

        assertEquals(2, map.size());
        assertFalse(map.isEmpty());

        assertTrue(map.containsKey(Direction.WEST));
        assertTrue(map.containsKey(Direction.SOUTH));
        assertFalse(map.containsKey(Direction.EAST));
        assertFalse(map.containsKey(Direction.NORTH));
        assertTrue(map.containsValue(1));
        assertFalse(map.containsValue(0));
    }

    @Test
    public void testIncrementCountMapWildcards4() {

        EnumMap<?, Integer> mm = new EnumMap<Direction, Integer>(Direction.class);
        Map<Enum<?>, Integer> map = (Map<Enum<?>, Integer>) mm;

        App.incrementCountMapWildcard(map, Direction.WEST);
        App.incrementCountMapWildcard(map, Direction.SOUTH);

        assertEquals(2, map.size());
        assertFalse(map.isEmpty());

        assertTrue(map.containsKey(Direction.WEST));
        assertTrue(map.containsKey(Direction.SOUTH));
        assertFalse(map.containsKey(Direction.EAST));
        assertFalse(map.containsKey(Direction.NORTH));
        assertTrue(map.containsValue(1));
        assertFalse(map.containsValue(0));
    }

    @Test
    public void testIncrementCountMapEnumDescG1() {
        Map<Enum.EnumDesc<Month>, Integer> map = new HashMap<>();
        App.incrementCountMapEnumDescG(map, Enum.EnumDesc.of(ClassDesc.of("java.time.Month"), "NOVEMBER"));
        App.incrementCountMapEnumDescG(map, Enum.EnumDesc.of(ClassDesc.of("java.time.Month"), "NOVEMBER"));

        assertEquals(1, map.size());
        assertFalse(map.isEmpty());

        assertTrue(map.containsKey(Enum.EnumDesc.of(ClassDesc.of("java.time.Month"), "NOVEMBER")));
        assertTrue(map.containsValue(2));
        assertFalse(map.containsValue(0));
    }


    @Test
    public void testIncrementCountMapEnumDescW1() {
        Map<Enum.EnumDesc<?>, Integer> map = new HashMap<>();
        App.incrementCountMapEnumDescW(map, Enum.EnumDesc.of(ClassDesc.of("java.time.Month"), "NOVEMBER"));
        App.incrementCountMapEnumDescW(map, Enum.EnumDesc.of(ClassDesc.of("java.time.Month"), "NOVEMBER"));

        assertEquals(1, map.size());
        assertFalse(map.isEmpty());

        assertTrue(map.containsKey(Enum.EnumDesc.of(ClassDesc.of("java.time.Month"), "NOVEMBER")));
        assertTrue(map.containsValue(2));
        assertFalse(map.containsValue(0));
    }

    @Test
    public void testIncrementCountMapEnumDescG2() {
        Map<Enum.EnumDesc<Month>, Integer> map = new HashMap<>();
        App.incrementCountMapEnumDescG(map, Enum.EnumDesc.of(ClassDesc.of("edu.estu.AppTest.Direction"), "WEST"));
        App.incrementCountMapEnumDescG(map, Enum.EnumDesc.of(ClassDesc.of("edu.estu.AppTest.Direction"), "SOUTH"));

        assertEquals(2, map.size());
        assertFalse(map.isEmpty());

        assertTrue(map.containsKey(Enum.EnumDesc.of(ClassDesc.of("edu.estu.AppTest.Direction"), "WEST")));
        assertTrue(map.containsKey(Enum.EnumDesc.of(ClassDesc.of("edu.estu.AppTest.Direction"), "SOUTH")));
        assertFalse(map.containsKey(Enum.EnumDesc.of(ClassDesc.of("edu.estu.AppTest.Direction"), "EAST")));
        assertFalse(map.containsKey(Enum.EnumDesc.of(ClassDesc.of("edu.estu.AppTest.Direction"), "NORTH")));

        assertTrue(map.containsValue(1));
        assertFalse(map.containsValue(0));
    }


    @Test
    public void testIncrementCountMapEnumDescW2() {
        Map<Enum.EnumDesc<?>, Integer> map = new HashMap<>();
        App.incrementCountMapEnumDescW(map, Enum.EnumDesc.of(ClassDesc.of("edu.estu.AppTest.Direction"), "WEST"));
        App.incrementCountMapEnumDescW(map, Enum.EnumDesc.of(ClassDesc.of("edu.estu.AppTest.Direction"), "SOUTH"));

        assertEquals(2, map.size());
        assertFalse(map.isEmpty());

        assertTrue(map.containsKey(Enum.EnumDesc.of(ClassDesc.of("edu.estu.AppTest.Direction"), "WEST")));
        assertTrue(map.containsKey(Enum.EnumDesc.of(ClassDesc.of("edu.estu.AppTest.Direction"), "SOUTH")));
        assertFalse(map.containsKey(Enum.EnumDesc.of(ClassDesc.of("edu.estu.AppTest.Direction"), "EAST")));
        assertFalse(map.containsKey(Enum.EnumDesc.of(ClassDesc.of("edu.estu.AppTest.Direction"), "NORTH")));

        assertTrue(map.containsValue(1));
        assertFalse(map.containsValue(0));
    }
}
