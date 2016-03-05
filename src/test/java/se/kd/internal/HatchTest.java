package se.kd.internal;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HatchTest {

    @Test
    public void get_rhyme() {
        String expected = "Dyker upp på festen med en sombrero<br>" +
                "och vad är det för fel med de'rå?<br>" +
                "Humöret på topp och lyckan total<br>" +
                "Varför skulle man ifrågasätta detta val?";
        Hatch hatch = new Hatch(expected, "", "", "10");

        String actual = hatch.getRhyme();

        assertThat(actual, is(expected));
    }

    @Test
    public void get_photograper() {
        String expected = "Kårt";
        Hatch hatch = new Hatch("", expected, "", "14");

        String actual = hatch.getPhotographer();

        assertThat(actual, is(expected));
    }

    @Test
    public void get_vers() {
        String expected = "B2";
        Hatch hatch = new Hatch("", "", expected, "10");

        String actual = hatch.getVers();

        assertThat(actual, is(expected));
    }

    @Test
    public void get_hatch_number() {
        String expected = "13";
        Hatch hatch = new Hatch("", "", "", expected);

        String actual = hatch.getNumber();

        assertThat(actual, is(expected));
    }

    @Test
    public void get_next_hatch_number() {
        String expected = "14";
        Hatch hatch = new Hatch("", "", "", "13");

        String actual = hatch.getNext();

        assertThat(actual, is(expected));
    }

    @Test
    public void get_previous_hatch_number() {
        String expected = "12";
        Hatch hatch = new Hatch("", "", "", "13");

        String actual = hatch.getPrevious();

        assertThat(actual, is(expected));
    }
}
