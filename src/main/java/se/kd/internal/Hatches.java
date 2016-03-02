package se.kd.internal;

import java.util.HashMap;
import java.util.Map;

public class Hatches {

    private Map<String, Hatch> hatches = new HashMap<>();

    public Hatches() {

        hatches.put("10", new Hatch("Dyker upp på festen med en sombrero<br>" +
                "och vad är det för fel med de'rå?<br>" +
                "Humöret på topp och lyckan total<br>" +
                "Varför skulle man ifrågasätta detta val?", "Kårt", "Helmer"));

        hatches.put("14", new Hatch("Att dansa är bara<br>" +
                "ett annat sätt för dem att vara<br>" +
                "vår allra mysigaste lilla styrelseskara "
                , "Kårt", "mas"));
    }

    public Hatch getHatch(String number) {
        return hatches.get(number);
    }
}
