package se.kd.internal;

import java.util.Objects;

public class Hatch {
    private String rhyme;
    private String photographer;
    private String vers;
    private HatchNumber hatchNumber;

    public Hatch(String rhyme, String photographer, String vers, String number) {
        this.rhyme = rhyme;
        this.photographer = photographer;
        this.vers = vers;
        hatchNumber = new HatchNumber(number);
    }

    // todo get a html formated version
    // todo get a non html formated version
    public String getRhyme() {
        return rhyme;
    }

    public String getPhotographer() {
        return photographer;
    }

    public String getVers() {
        return vers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hatch hatch = (Hatch) o;
        return Objects.equals(rhyme, hatch.rhyme) &&
                Objects.equals(photographer, hatch.photographer) &&
                Objects.equals(vers, hatch.vers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rhyme, photographer, vers);
    }

    public String getNumber() {
        return hatchNumber.getNumber();
    }

    public String getNext() {
        return hatchNumber.getNext();
    }

    public String getPrevious() {
        return hatchNumber.getPrevious();
    }
}
