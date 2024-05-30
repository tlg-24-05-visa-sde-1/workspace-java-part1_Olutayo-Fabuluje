/*
 * Application class to model the workings of a television set.
 * NO main() method here.
 */
class Television {
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;

    private static int instanceCount = 0;

    public static int getInstanceCount() {
        return instanceCount;
    }

    // properties or attributes - called "instance variables" or "fields"
    private String brand; // brand name
    private int volume;
    private DisplayType display = DisplayType.LED;
    boolean isMuted;   // For muting behavior
    int oldVolume;     // For muting behavior


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


    // Getters and Setters


    public boolean isMuted() {
        return isMuted;
    }


    private String getBrand() {
        return brand;
    }


    public void setBrand(String Brand) {
        if (Brand.equals("Samsung ") || Brand.equals("LG ") || Brand.equals("Toshiba ")
                || Brand.equals("Sony ")) {
            this.brand = Brand;
        } else {
            System.out.println("Invalid brand: " + Brand + "must be Samsung , LG, Sony, or Toshiba");
        }

    }


    public int getVolume() {
        return volume;
    }


    public void setVolume(int volume) {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME) {
            this.volume = volume;
            isMuted = false;
        } else {
            System.out.println("Invalid Volume must be between " + MIN_VOLUME + " and " + MAX_VOLUME);
        }


    }

    public DisplayType getDisplay() {
        return display;
    }


    public void setDisplay(DisplayType display) {
        this.display = display;
    }


    public String volumeString = isMuted() ? "<Muted>" : String.valueOf(volume);

    {
        System.out.println("Television: Brand= " + getBrand() + " volume=" + volumeString);

    }

    public String toString() {
        return "Television: Brand =  " + getBrand() + "Volume= " + getVolume() + "DisplayType= " + display;
    }
}