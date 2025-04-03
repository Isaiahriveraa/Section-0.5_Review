import java.util.*;

// Represents a segmented line
public class Line {
    private SortedSet<Point> points;

    // Constructs a new line
    public Line() {
        this.points = new TreeSet<>();
    }

    // Adds the given Point 'p' to this line, inserting it at the appropriate spot
    public void addPoint(Point p) {
        this.points.add(p);
    }

    // Returns the first Point (smallest x-value) within the line
    // Throws an NoSuchElement exception if there are no points within the line
    public Point getStart() {
        return points.getFirst();
    }

    // Returns the last Point (largest x-value) within the line
    // Throws an NoSuchElement exception if there are no points within the line
    public Point getEnd() {
        return points.getLast();
    }

    // Returns the total number of points within the line
    public int getNumPoints() {
        return points.size();
    }
}
