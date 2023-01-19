package dmit2015.model;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class RectangleParameterizedTest {

    // name = "" allows the user to name the test data - useful for the output screen.
    @ParameterizedTest(name = "width = {0}, length = {1}, expected area = {2} ")
    @CsvSource({
            "1.0,2.0,2.0",
            "25.0,50.0,1250.0",
            "150.0,250.0,37500.0"
    })
    void area(double width, double length, double expectedArea) {
        Rectangle newRectangle = new Rectangle(width, length);
        assertEquals(expectedArea, newRectangle.area(), 0.05);
    }

    @ParameterizedTest(name = "width = {0}, length = {1}, expected perimeter = {2} ")
    @CsvSource({
            "1.0,2.0,6.0",
            "25.0,50.0,150.0",
            "150.0,250.0,800.0"
    })
    void perimeter(double width, double length, double expectedPerimeter) {
        Rectangle newRectangle = new Rectangle(width, length);
        assertEquals(expectedPerimeter, newRectangle.perimeter(), 0.05);
    }

    @ParameterizedTest(name = "width = {0}, length = {1}, expected diagonal = {2} ")
    @CsvSource({
            "1.0,2.0,2.236",
            "25.0,50.0,55.9",
            "150.0,250.0,291.55"
    })
    void diagonal(double width, double length, double expectedDiagonal) {
        Rectangle newRectangle = new Rectangle(width, length);
        assertEquals(expectedDiagonal, newRectangle.diagonal(), 0.05);
    }
}