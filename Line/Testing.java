import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import org.junit.jupiter.params.provider.*;
import static org.junit.jupiter.api.Assertions.*;



public class Testing {

    @Test
    @DisplayName("Constructor tests")
    public void testConstructor() {
        // Test that the Line constructor works properly:
        //      getNumPoints() returns 0
        Line l = new Line();
        assertTrue(0, l.getNumPoints());
    }

    @Test
    @DisplayName("Add tests")
    public void testAdd() {
        // Test that the addPoint() method works properly:
        //      Add a single point (0, 0) and check getNumPoints()
        //      Add another point (1, 1) and check getNumPoints()
        //      Add a third point (2, 2) and check getNumPoints()
        Line l = new Line();
        l.addPoint(new Point(0, 0));
        assertTrue(1, l.getNumPoints());

        l.addPoint(new Point(1, 1));
        assertTrue(2, l.getNumPoints());

        l.addPoint(new Point(2, 2));
        assertTrue(3, l.getNumPoints());
    }

    @Test
    @DisplayName("Get first / last tests")
    public void testGetters() {
        // Test that the getFirst() / getLast() methods work properly:
        //      Add two points (0, 0), (1, 1) and check getNumPoints()
        //      Test getFirst() and getLast() appropriately
        //      Add another point (2, 2) and check getNumPoints()
        //      Test getFirst() and getLast() appropriately
        //      Add a point to the beginning (-1, -1) and check getNumPoints()
        //      Test getFirst() and getLast() appropriately
        Line l = new Line();

        l.addPoint(new Point(0, 0));
        l.addPoint(new Point(1, 1));
        assertEquals(2, l.getNumPoints());
        assertEquals(new Point(0, 0), l.getFirst());
        assertEquals(new Point(1, 1), l.getLast());

        l.addPoint(new Point(2, 2));
        assertEquals(3, l.getNumPoints());
        assertEquals(new Point(0, 0), l.getFirst());
        assertEquals(new Point(2, 2), l.getLast());

        l.addPoint(new Point(-1, -1));
        assertEquals(4, l.getNumPoints());
        assertEquals(new Point(-1, -1), l.getFirst());
        assertEquals(new Point(2, 2), l.getLast());
    }

    @Test
    @DisplayName("Exception tests")
    public void testExceptions() {
        // Bonus! Test that getFirst() / getLast() throw the proper exceptions
        //      on an empty Line
        assertThrows(NoSuchElementException.class, () -> {
            Line l = new Line();
            l.getFirst();
        });

        assertThrows(NoSuchElementException.class, () -> {
            Line l = new Line();
            l.getLast();
        });
    }
}