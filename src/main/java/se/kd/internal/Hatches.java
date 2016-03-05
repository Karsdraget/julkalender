package se.kd.internal;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Hatches {

    private Map<String, Hatch> hatches = new HashMap<>();

    public Hatches() {
        hatches.put("1", new Hatch("Nu är det äntligen dags för årets kalender<br>" +
                "Men så öppna ögenen för att se vad som händer.<br>" +
                "Några luckor kommer att leda till skratt,<br>" +
                "andra kan leda till undran om hur det är fatt?<br>" +
                "Själva har vi många strängar på vår lyra,<br>" +
                "så många att vi hoppas att det räcker ända till lucka 24.",
                "B2/Mamma-Karin", "Hellmer", "1"));

        hatches.put("2", new Hatch("Snygg som en filmaffisch,<br>" +
                "svingar trumstockar med ett swisch<br>" +
                "Vad vore Kårsdraget utan boom, tjaff, piff<br>" +
                "Ragadabadadadumpumhumdisch<br>" +
                "Köra buss, hur svårt kan det va?<br>" +
                "Stanna och växla, kan Elin bra",
                "Mamma-Karin", "Määärta", "2"));

        hatches.put("3", new Hatch("En växel från Jönköping,<br>" +
                "och nu ska vi se,<br>" +
                "om vi till Stockholm kan komma på denna turné<br>" +
                "<br>" +
                "Livet leker, vi har drinkar med is,<br>" +
                "turnén går efter denna devis.<br>" +
                "<br>" +
                "\"Det finns inga problem,<br>" +
                "det finns bara havreflarn.\" ",
                "kort", "Määärta, Hellmer, B2", "3"));

        hatches.put("4", new Hatch("5 delar Gelbe Banane man haver<br>" +
                "tillsammans med en Warstiner i glaset man begraver.<br>" +
                "Inspekteras sedan noga av utbildad aukoritet.<br>" +
                "Och bananer är ju något som B2 vet. ",
                "Mamma-Karin", "hellmer", "4"));

        hatches.put("5", new Hatch(" Att filtrera all öl är viktigt och bra,<br>" +
                "god smak och arom vill Kårsdraget ha,<br>" +
                "om ölen luktar annat än bröd,<br>" +
                "har den runnit genom använd strumpa röd.<br>" +
                "<br>" +
                "Det får inte skumpa,<br>" +
                "när man filterar öl i sin strumpa! ",
                "kort", "Määärta, mas", "5"));

        hatches.put("6", new Hatch("Mellan vägg och skål<br>" +
                "kan det lätt bli hål.<br>" +
                "Ur glaset det då saknas en skärva,<br>" +
                "vilket (kan) få drickandet att kärva. ",
                "Kort", "Hellmer", "6"));

        hatches.put("7", new Hatch("Tur att konserten gick i hamn.<br>" +
                "Elsa vilar ut i PQ-famn. ",
                "Huilu", "B2", "7"));

        hatches.put("8", new Hatch("Spela rätt och Robert blir vän och fin,<br>" +
                "spela som det låter och Robert visar sin gangstamin,<br>" +
                "blir det för mycket rekommenderar vi antihistamin. ",
                "Qnyckarn", "Määärta", "8"));

        hatches.put("9", new Hatch("En uppblåsbar Huilu av gummi<br>" +
                "kan ju få vem som helst att verka flummi?<br>" +
                "två stycken blir en dubbel<br>" +
                "båda matas helst med bubbel ",
                "kort", "Määrta och Hellmer", "9"));

        hatches.put("10", new Hatch("Dyker upp på festen med en sombrero<br>" +
                "och vad är det för fel med de'rå?<br>" +
                "Humöret på topp och lyckan total<br>" +
                "Varför skulle man ifrågasätta detta val?",
                "Kårt", "Helmer", "10"));

        hatches.put("11", new Hatch("I bussen sprider sig macarena,<br>" +
                "vilket är ett återkommande tema.<br>" +
                "Viss träning kan de behöva.<br>" +
                "Se Mamma-Karin flitigt öva. ",
                "Kort", "B2 och Kort", "11"));

        hatches.put("12", new Hatch("Man tager vad man haver,<br>" +
                "i soppan man begraver.<br>" +
                "Hamster smakar fläsk och nöt,<br>" +
                "Hoppsan nu blev soppan allt för söt. ",
                "Harald", "Hellmer", "12"));

        hatches.put("13", new Hatch("Årets lucia kommer med ljus i hår,<br>" +
                "Sprider glädje vart hon än går.<br>" +
                "Någon bild på Åsa med krona vi inte fick.<br>" +
                "Så vi ordnade det så gott det gick. ",
                "Harald", "Hellmer", "13"));

        hatches.put("14", new Hatch("Att dansa är bara<br>" +
                "ett annat sätt för dem att vara<br>" +
                "vår allra mysigaste lilla styrelseskara",
                "Kårt", "mas", "14"));

        hatches.put("15", new Hatch("Bussmys som sig bör.<br>" +
                "Vem kan motstå en charmör?<br>" +
                "Hans charm verkar gå vägen,<br>" +
                "får napp i alla lägen.",
                "B2", "B2", "15"));

        hatches.put("16", new Hatch("När brandlarmet i Allhuset går<br>" +
                "Kaos i Kårsdraget uppstår<br>" +
                "Men inte på det vanliga sättet<br>" +
                "För dom är ju helt från vettet<br>" +
                "Orkestern till larmet glatt ackompanjera<br>" +
                "Å baletten fortsätter öva på att briljera. ",
                "semlan", "semlan", "16"));

        hatches.put("17", new Hatch("Från årets konsert vi denna lucka hämta,<br>" +
                "och ett nummer som fick många att flämta.<br>" +
                "Hela numret hade en bra idé och fint flyt.<br>" +
                "Men att en gummianka inte drunknar, visade sig vara en myt. ",
                "Harald", "Hellmer", "17"));

        hatches.put("18", new Hatch(" Modevisning, då gäller det att var fin.<br>" +
                "Visa upp sin bästa min.<br>" +
                "Som gammal kapellmästarinna har man ju koll på detaljer,<br>" +
                "Men viktigast är ju ändå att kunna skramla med alla medaljer. ",
                "Harald", "Hellmer", "18"));

        hatches.put("19", new Hatch("Coola tjejer i Lätta Blåset<br>" +
                "de har fått till det rätta flåset.<br>" +
                "Simo håller sig tätt där bakom<br>" +
                "klart man vill hänga med dessa, liksom. ",
                "Kårt", "B2 och Kårt", "19"));

        hatches.put("20", new Hatch("När tant Barin svänger på ratten<br>" +
                "Flyger vi fram uti natten<br>" +
                "Även tant Dregelin<br>" +
                "Hjälper dramaturgin<br>" +
                "När det svamlas om ditten och datten. ",
                "eileeen", "eileeen", "20"));

        hatches.put("21", new Hatch("Wundersaxofonisten Bell<br>" +
                "Är en glittrande tjusig mamsell<br>" +
                "Efter sex-åtta bärs<br>" +
                "Ser hon miss Univers<br>" +
                "Och utmanar på posing-duell ",
                "Eileen", "Eileeen", "21"));

        hatches.put("22", new Hatch("Bära saker, många saker<br>" +
                "oftast även andras saker.<br>" +
                "Bibbi kånkar så att det förslår<br>" +
                "Men visar att det faktiskt går. ",
                "Eileen", "hellmer", "22"));

        hatches.put("23", new Hatch("Ibland vill man slippa jazzen<br>" +
                "och gå och gömma sig i vassen.<br>" +
                "-Nej, nu gick det inte rätt till!<br>" +
                "Det är ju Juff som slår en drill.",
                "B2-5+1", "B5-3", "23"));

        hatches.put("24", new Hatch("Oj hoppsan plötsligt är vi framme vid lucka 24<br>" +
                "Och man skulle kunna tro att goda råd nu är dyra.<br>" +
                "Många bidrag har fått oss att vela<br>" +
                "så nu får det vara slut med det hela<br>" +
                "Årets julkalender tacka för sig får,<br>" +
                "och önskar en God Jul och Gott Nytt År!<br>" +
                "<br>" +
                "Alla bra bilder kom inte mé,<br>" +
                "Men klicka här så får ni några av dem se.",
                "B2, Kårt, David, Eileeen och otaliga andra", "hellmer", "24"));
    }

    public Hatch getHatch(String number) {
        return hatches.get(number);
    }

    public List<Hatch> getAll() {
        List<Hatch> allHatches = new LinkedList<>();

        for (Hatch h : hatches.values()) {
            allHatches.add(h);
        }

        return allHatches;
    }
}
