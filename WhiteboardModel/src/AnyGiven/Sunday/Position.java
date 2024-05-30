package AnyGiven.Sunday;

public enum Position {
    QUARTERBACK("Quarterback"),
    RUNNING_BACK("Running Back"),
    WIDE_RECEIVER("Wide Receiver"),
    DEFENSIVE_END("Defensive Back"),
    TIGHT_END("Tight End");

    private final String display;

    Position(String display) {
        this.display = display;
    }

    public String getDisplay() {
        return display;
    }

    public String toString() {
        return getDisplay();

    }

}