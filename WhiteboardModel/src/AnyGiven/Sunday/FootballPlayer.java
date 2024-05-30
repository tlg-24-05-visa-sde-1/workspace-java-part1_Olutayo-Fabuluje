package AnyGiven.Sunday;

public class FootballPlayer {

    // Static Variables
    public static final int MIN_ELIGIBILITY = 18;

    public static final String[] VALID_TEAMS = {"Ravens", "Cowboys", "Chiefs", "Raiders"};


    // Attributes
    String team;                // Name of the football player's team

    public int strength;        // Football player's strength

    public double speed;        // Football player's speed

    public int age = 18;        // Player age

    private Position position;  // Football player's position


    // Constructors
    public FootballPlayer() {
    }


    public FootballPlayer(String team) {
        setTeam(team);
    }


    public FootballPlayer(String team, int benchReps) {
        this(team);
        setStrength(benchReps);
    }


    public FootballPlayer(String team, int strength, double speed) {
        this(team, strength);
        setSpeed(speed);
    }


    public FootballPlayer(String team, int strength, double speed, int age, Position position) {
        this(team, strength, speed);
        setAge(age);
        setPosition(position);

    }

    // Business Methods

    public void throwPass() {
        System.out.println(position + " Passed 50 yards for a " + team + " TOUCHDOWN and a week one " + "WIN!!!");
    }


    public void run() {
        System.out.println(position + " Was stuffed on the 1 yard line resulting in a " + team + " Turnover on downs");
    }


    public void catchPass() {
        System.out.println(position + " Caught a pass for a 40 yard gain, and a " + team + " First Down!!!");
    }


    public void dash() {
        System.out.println(" Ran a blistering " + speed + "40 yard dash at the NFL combine");
    }


    public void bench() {
        System.out.println(position + " completed " + strength + " bench reps at 225lbs at the NFL combine");
    }


    public void sack() {
        System.out.println(position + " performed a spin move and destroyed Tom Brady");
    }


    // Accessor


    public String getTeam() {
        return team;
    }


    public void setTeam(String team) {
        this.team = team;
    }


    public Position getPosition() {
        return position;
    }


    public void setPosition(Position position) {
        this.position = position;
    }


    public int getStrength() {
        return strength;
    }


    public void setStrength(int strength) {
        this.strength = strength;
    }


    public double getSpeed() {
        return speed;
    }


    public void setSpeed(double speed) {
        this.speed = speed;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        if (age >= MIN_ELIGIBILITY) {
            this.age = age;
            System.out.println("Player is eligible for the NFL");
        } else {
            System.out.println("Invalid Age: " + age + " Player must be at least " + MIN_ELIGIBILITY +
                    " years old to play in NFL");
        }


    }

    private static boolean isValidTeam(String team) {
        boolean isValid = false;
        for (String validTeam : VALID_TEAMS) {
            if (team.equalsIgnoreCase(validTeam)) {
                isValid = true;
                break;
            }
        }
        return isValid;
    }


    // To String

    public String toString() {
        return "FootballPlayer: team= " + getTeam() + ", benchReps=" + getStrength() +
                ", fortyTime=" + getSpeed() + ", position=" + getPosition() +
                ", ageLimit=" + getAge();
    }
}
