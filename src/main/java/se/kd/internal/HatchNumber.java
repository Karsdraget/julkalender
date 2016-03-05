package se.kd.internal;

public class HatchNumber {
    private String currentHatch;

    public HatchNumber(String number) {
        validate(number);

        this.currentHatch = number;
    }

    private void validate(String currentHatch) {
        int hatchNumber;
        try {
            hatchNumber = Integer.parseInt(currentHatch);
        } catch (NumberFormatException e) {
            throw new InvalidHatchException();
        }

        if (hatchNumber < 1) {
            throw new InvalidHatchException();
        }

        if (hatchNumber > 24) {
            throw new InvalidHatchException();
        }
    }

    public String getNext() {
        int current = Integer.parseInt(currentHatch);

        if (current == 24) {
            return "24";
        }

        return current + 1 + "";
    }

    public String getPrevious() {
        int current = Integer.parseInt(currentHatch);

        if (current == 1) {
            return "1";
        }

        return current - 1 + "";
    }

    public String getNumber() {
        return currentHatch;
    }
}
