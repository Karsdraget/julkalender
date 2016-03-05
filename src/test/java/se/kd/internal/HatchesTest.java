package se.kd.internal;

import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class HatchesTest {
    @Test
    public void get_hatch_10() {
        String rhyme = "Dyker upp på festen med en sombrero<br>" +
                "och vad är det för fel med de'rå?<br>" +
                "Humöret på topp och lyckan total<br>" +
                "Varför skulle man ifrågasätta detta val?";
        String photographer = "Kårt";
        String vers = "Helmer";
        Hatch expected = new Hatch(rhyme, photographer, vers, "10");
        Hatches hatches = new Hatches();

        Hatch actual = hatches.getHatch("10");

        assertThat(actual, is(expected));
    }

    @Test
    public void get_all_hatches(){
        Hatches hatches = new Hatches();

        List<Hatch> actual = hatches.getAll();

        assertThat(actual.size(), is(24));
        // todo assert that the list is sorted
    }
}
