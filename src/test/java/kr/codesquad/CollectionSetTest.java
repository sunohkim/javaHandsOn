package kr.codesquad;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

public class CollectionSetTest {
    public HashSet<Point> points;
    @BeforeEach
    void setUp() {
        points = new HashSet<>();
        points.add(Point.of(1, 1));
        points.add(Point.of(2, 2));
        points.add(Point.of(3, 3));
    }

    @Test
    public void printHashSet() {
        // 실습 진행
        for (Point point : points) {
            System.out.println(point);
        }
    }

    @Test
    public void removePoint() {
        points.remove(Point.of(1,1));

        assertEquals(2,points.size());
    }

    @Test
    public void addNewPoint() {
        points.add(Point.of(2,2));

        assertEquals(3,points.size());
    }
}
