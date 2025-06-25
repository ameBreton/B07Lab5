import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class TestRectangle {

    @Test
    public void testLength(){
        // Test for Rectangle length
        Rectangle r = new Rectangle(new Point(1, 2), new Point(5, 6));
        assertEquals(4, r.length());
    }

    @Test
    public void testWidth(){
        // Test for Rectangle width
        Rectangle r = new Rectangle(new Point(1, 2), new Point(5, 6));
        assertEquals(4, r.width());
    }

    @Test
    public void testPerimeter() {
        // Test for Rectangle perimeter
        Rectangle r = new Rectangle(new Point(1, 2), new Point(5, 6));
        assertEquals(16, r.perimeter());
    }

    @Test
    public void testArea(){
        // Test for Rectangle area
        Rectangle r = new Rectangle(new Point(1, 2), new Point(5, 6));
        assertEquals(16, r.area());
    }

    @Test
    public void testIsSquare_True() {
        // Test for Rectangle isSquare method
        Rectangle r = new Rectangle(new Point(0, 0), new Point(3, 3));
        assertTrue(r.isSquare());
    }

    @Test
    public void testIsSquare_False(){
        // Test for Rectangle isSquare method
        Rectangle r = new Rectangle(new Point(0, 0), new Point(4, 2));
        assertFalse(r.isSquare());
    }

    @Test
    public void testEquals_SameDimensions(){      
        // Test for Rectangle equals method with same dimensions          
        Rectangle r1 = new Rectangle(new Point(0, 0), new Point(4, 3));
        Rectangle r2 = new Rectangle(new Point(4, 3), new Point(0, 0));

        assertTrue(r1.equals(r2));
    }

    @Test
    public void testEquals_DifferentDimensions(){
        // Test for Rectangle equals method with different dimensions
        Rectangle r1 = new Rectangle(new Point(0, 0), new Point(4, 3));
        Rectangle r2 = new Rectangle(new Point(0, 0), new Point(3, 4));

        assertFalse(r1.equals(r2));
    }

    @Test
    public void testEquals_SameObject(){
        // Test for Rectangle equals method with same object
        Rectangle r = new Rectangle(new Point(0, 0), new Point(2, 2));

        assertTrue(r.equals(r));
    }

    @Test
    public void testEquals_Null(){
        // Test for Rectangle equals method with null
        Rectangle r = new Rectangle(new Point(0, 0), new Point(2, 2));

        assertFalse(r.equals(null));
    }

    @Test
    public void testEquals_DifferentClass(){
        // Test for Rectangle equals method with different class
        Rectangle r = new Rectangle(new Point(0, 0), new Point(2, 2));
        String notARectangle = "Rectangle";

        assertFalse(r.equals(notARectangle));
    }
    
    @Test
    public void testEquals_SameWidthDifferentLength(){
        // Test for Rectangle equals method with same width but different lengths
        Rectangle r1 = new Rectangle(new Point(0, 0), new Point(4, 3)); // length 4, width 3
        Rectangle r2 = new Rectangle(new Point(0, 0), new Point(3, 3)); // length 3, width 3

        assertFalse(r1.equals(r2));
    }
    
    @Test
    public void testEquals_DifferentWidthSameLength(){
        // Test for Rectangle equals method with different widths but same lengths
        Rectangle r1 = new Rectangle(new Point(0, 0), new Point(4, 3)); // width = 3
        Rectangle r2 = new Rectangle(new Point(0, 0), new Point(4, 4)); // width = 4

        assertFalse(r1.equals(r2)); 
    }


}
