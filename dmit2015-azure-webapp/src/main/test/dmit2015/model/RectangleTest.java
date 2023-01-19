package dmit2015.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void area() {
        Rectangle rectangle1 = new Rectangle(2, 4);
        assertEquals(8, rectangle1.area());
    }

    @Test
    void perimeter() {
        Rectangle rectangle1 = new Rectangle(2, 4);
        assertEquals(12, rectangle1.perimeter());
    }

    @Test
    void diagonal() {
        Rectangle rectangle1 = new Rectangle(2, 4);
        assertEquals(4.472, rectangle1.diagonal(), 0.0002);
    }
}