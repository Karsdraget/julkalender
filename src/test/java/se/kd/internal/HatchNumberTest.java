package se.kd.internal;

import org.junit.Test;

import java.time.LocalDate;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HatchNumberTest {
    private LocalDate dec13 = LocalDate.parse("2016-12-13");
    private LocalDate notImportant = LocalDate.parse("2016-12-27");

    @Test
    public void get_next() {
        String expected = "14";
        HatchNumber hatchNumber = new HatchNumber("13");

        String actual = hatchNumber.getNext();

        assertThat(actual, is(expected));
    }

    @Test
    public void get_previous() {
        String expected = "12";
        HatchNumber hatchNumber = new HatchNumber("13");

        String actual = hatchNumber.getPrevious();

        assertThat(actual, is(expected));
    }

    @Test
    public void do_not_go_below_one() {
        String expected = "1";
        HatchNumber hatchNumber = new HatchNumber("1");

        String actual = hatchNumber.getPrevious();

        assertThat(actual, is(expected));
    }

    @Test
    public void do_not_go_above_twenty_four() {
        String expected = "24";
        HatchNumber hatchNumber = new HatchNumber("24");

        String actual = hatchNumber.getNext();

        assertThat(actual, is(expected));
    }

    @Test(expected = InvalidHatchException.class)
    public void twenty_five_is_an_invalid_hatch() {
        new HatchNumber("25");
    }

    @Test(expected = InvalidHatchException.class)
    public void zero_is_an_invalid_hatch() {
        new HatchNumber("0");
    }

    @Test(expected = InvalidHatchException.class)
    public void foo_is_an_invalid_hatch() {
        new HatchNumber("foo");
    }
}
