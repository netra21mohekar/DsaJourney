import java.util.Arrays;
import java.util.Comparator;

// Point class
class Point {
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Override toString() to print Point details
    @Override
    public String toString() {
        return "x = " + x + ", y = " + y;
    }
}

// Comparator to sort Points by x-coordinate
class MyComparator implements Comparator<Point> {
    @Override
    public int compare(Point a, Point b) {
        return Integer.compare(a.x, b.x);  // Sort by x-coordinate
    }
}

// Test class
public class comaparison {
    public static void main(String[] args) {
        // Create an array of Points
        Point[] arr = {
                new Point(2, 5),
                new Point(9, 8),
                new Point(16, 10),
                new Point(3, 2)
        };

        // Sort using MyComparator
        Arrays.sort(arr, new MyComparator());

        // Print the sorted array
        for (Point p : arr) {
            System.out.println(p);
        }
    }
}
