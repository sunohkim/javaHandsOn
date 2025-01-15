package kr.codesquad;

public class Point {
    private final int x;
    private final int y;

    Point(int x, int y) {
        if (x < 0 || x > 24) {
            throw new IllegalArgumentException();
        }
        this.x = x;

        if (y < 0 || y > 24) {
            throw new IllegalArgumentException();
        }
        this.y = y;
    }

    public static Point of(int x, int y) {
        return new Point(x, y);
    }

    public static Point ofCommaSeparator(String text) {
        String[] values = text.split(",");
        return new Point(Integer.parseInt(values[0]), Integer.parseInt(values[1]));
    }

    @Override
    public int hashCode() {
        return x * 100 + y;
    }

    @Override
    public boolean equals(Object obj) {
        return this.hashCode() == obj.hashCode();
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
