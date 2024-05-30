package com.entertainment;

/*
 * Application class to model the workings of a television set.
 * NO main() method here.
 */
public class Television {
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    // properties or attributes - called "instance variables" or "fields"
    private String brand; // brand name
    private int volume;
    private DisplayType display = DisplayType.LED;

    // Muting
    private boolean isMuted;   // For muting behavior
    private int oldVolume;     // For muting behavior


    // Constructors - these get called when the client says "new"
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();     // Delegate to no-arg ctor for the increment
        setBrand(brand);
    }

    public Television(String brand, int volume) {
        this(brand);      // delegate to brand ctor above for handling brand
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) {
        this(brand, volume);
        setDisplay(display);
    }


    // functions or behaviors - called "methods" in Java

    public void turnOn() {
        System.out.println("Turning on your " + getBrand() + " television to volume " + getVolume());
    }


    public void turnOff() {

        System.out.println("Shutting down...goodbye");
    }

    public void mute() {
        if (!isMuted()) {
            oldVolume = getVolume();
            setVolume(0);
            isMuted = true;
        } else {
            setVolume(oldVolume);
            isMuted = false;
        }

    }


    // Accessor Methods


    public boolean isMuted() {
        return isMuted;
    }


    private String getBrand() {
        return brand;
    }

    // Checking if brand is correct
    //["Samsung", "LG", "Sony", "Toshiba"]
    public void setBrand(String Brand) {
        switch (brand) {
            case "Samsung":
            case "LG":
            case "Sony":
            case "Toshiba":
                this.brand = Brand;
                break;
            default:
                System.out.println("The given brand is invalid: " + brand + "." + "Please use Samsung, LG, Sony, Toshiba");
        }

    }


    public int getVolume() {
        return volume;
    }


    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {     // Valid assign to field
            this.volume = volume;
            isMuted = false;
        } else {
            System.out.printf("Invalid volume: %s. Must be between %s and %s.\n",
                    volume, MIN_VOLUME, MAX_VOLUME);
//            System.out.println("Invalid Volume: must be between " + MIN_VOLUME + " and " + MAX_VOLUME);
        }


    }

    public DisplayType getDisplay() {
        return display;
    }


    public void setDisplay(DisplayType display) {
        this.display = display;
    }


    // Strings

    // Only returns boolean no setting
    private static boolean isValidBrand(String brand) {
        boolean isValid = false;                    // brand, the incoming parameter, and VALID_BRANDS
        for (String validBrand : VALID_BRANDS) {
            if (brand.equals(validBrand)) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }


    public String toString() {
            String displayString = isMuted() ? "<Muted>" : String.valueOf(getDisplay());
        {
            System.out.println("Television: Brand =  " + getBrand() + "Volume= " + getVolume() + "DisplayType= "
                    + display);
        }

        return displayString;
    }
}