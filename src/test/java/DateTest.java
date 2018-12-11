import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateTest {

    Date myDate;
    Date expectedDate;

    @Before
    public void initialize() {
        myDate = new Date();
        expectedDate = new Date(2018, 11, 27);
    }

    @Test
    public void writeYourDateWithDots() {
        // Given
        String data = "27.11.2018";
        String divider = ".";
        // When
        myDate = Date.writeYourDate(data, divider);
        // Then
        assertEquals(expectedDate.getDay(), myDate.getDay());
        assertEquals(expectedDate.getMonth(), myDate.getMonth());
        assertEquals(expectedDate.getYear(), myDate.getYear());
    }

    @Test
    public void writeYourDateWithSlashes() {
        // Given
        String data = "27/11/2018";
        String divider = "/";
        // When
        myDate = Date.writeYourDate(data, divider);
        // Then
        assertEquals(expectedDate.getDay(), myDate.getDay());
        assertEquals(expectedDate.getMonth(), myDate.getMonth());
        assertEquals(expectedDate.getYear(), myDate.getYear());
    }

    @Test
    public void writeYourDateWithDifferentDividers() {
        // Given
        String data = "27,11/2018";
        String divider = ".,/";
        // When
        myDate = Date.writeYourDate(data, divider);
        // Then
        assertEquals(expectedDate.getDay(), myDate.getDay());
        assertEquals(expectedDate.getMonth(), myDate.getMonth());
        assertEquals(expectedDate.getYear(), myDate.getYear());
    }
}