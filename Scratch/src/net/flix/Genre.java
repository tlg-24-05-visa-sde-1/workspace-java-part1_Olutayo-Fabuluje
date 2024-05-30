package net.flix;

public enum Genre {
    // Each of these is calling the (private) ctor below
    ROMANCE("Romance"),
    COMEDY("Comedy :)"),
    HORROR("HORROR!!!"),
    ACTION("ACTION!"),
    SCI_FI("SCI-FI"),
    DRAMA("Drama"),
    SPORTS("Sports"),
    WESTERN("Western - Howdy");

   // Everything under here is regular class definition stuff, i.e., fields, ctors, methods

    private final String display;

    Genre(String display) {
        //System.out.println("Genre ctor called");
        this.display = display;
    }

    // We Provide a Getter Only - No Setter
    public String getDisplay() {
        return display;
    }

    public String toString() {
        return getDisplay();
    }
}