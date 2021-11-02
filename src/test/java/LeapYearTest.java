import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class LeapYearTest {

    @ParameterizedTest
    @ValueSource(ints = {4, 8, 12, 16})
    public void dividable_by_4_not_100(int year) {
        assertTrue(LeapYear.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {800, 1200, 1600, 2000})
    public void dividable_by_400(int year) {
        assertTrue(LeapYear.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 67, 109, 563})
    public void not_dividable_by_4(int year) {
        assertFalse(LeapYear.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {700, 900, 1300, 2100})
    public void dividable_by_100_not_400(int year) {
        assertFalse(LeapYear.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {2000, 2004, 2008, 1996})
    public void years_is_leap_year(int year) {
        assertTrue(LeapYear.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {1754, 2003, 1433, 2009})
    public void years_is_not_leap_year(int year) {
        assertFalse(LeapYear.isLeapYear(year));
    }

}
