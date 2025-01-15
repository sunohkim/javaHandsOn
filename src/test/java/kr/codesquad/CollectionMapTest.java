package kr.codesquad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;

public class CollectionMapTest {
    public HashMap<Integer, Point> points;
    @BeforeEach
    public void setUp() {
        points = new HashMap<>();
        points.put(1, Point.of(1, 1));
        points.put(2, Point.of(3, 5));
        points.put(3, Point.of(5, 7));
    }

    @Test
    public void print() {
        System.out.println(points.get(2));
    }

    @Test
    public void addPoint() {
        points.put(4, Point.of(10,15));
        for (Point point : points.values()) {
            System.out.println(point);
        }

        assertEquals(4, points.size());
    }

    @Test
    public void removePoint() {
        points.remove(3);
        for (Point point : points.values()) {
            System.out.println(point);
        }

        assertEquals(2, points.size());
    }

    @Test
    public void printAll() {
        for (int i: points.keySet()) {
            System.out.println("key: " + i + ", point: " + points.get(i));
        }
    }
}
