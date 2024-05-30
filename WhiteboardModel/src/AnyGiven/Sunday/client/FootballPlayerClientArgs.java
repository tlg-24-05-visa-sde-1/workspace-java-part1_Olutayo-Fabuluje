package AnyGiven.Sunday.client;

import AnyGiven.Sunday.FootballPlayer;
import AnyGiven.Sunday.Position;

import java.util.Arrays;


class FootballPlayerClientArgs {
    public static void main(String[] args) {
        if (args.length < 4) {
            String usage = "Usage : java FootballPlayerClientArgs <team> <strength> <speed> <age> <position>";
            String example = "Example: java FootballPlayerClientArgs Ravens 14 4.31 18 QUARTERBACK";
            String note = "Notes: " +
                    "\n Available teams are " + Arrays.toString(FootballPlayer.VALID_TEAMS) +    // Jay I Know this should be an enum just trying to immerse myself with everything we've been taught to see possibilities
                    "\n Player strength: is measured by the amount bench reps they complete at 225lbs" +
                    "\n Player speed is measured by their 40 yard dash time" +
                    "\n Age must be at least " + FootballPlayer.MIN_ELIGIBILITY + " years old to play in NFL" +
                    "\n Player positions include : " + Arrays.toString(Position.values());
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note);
            return;
        }


        // Process argument strings into proper types for a Football Player
        String team = args[0];
        int strength = Integer.parseInt(args[1]);
        double speed = Double.parseDouble(args[2]);
        int age = Integer.parseInt(args[3]);
        Position position = Position.valueOf(args[4].toUpperCase());


        // created a FootballPlayer object from these 5 values
        FootballPlayer fp1 = new FootballPlayer(team, strength, speed, age, position);


        // Print the result
        System.out.println("Thank you for participating in the NFL combine");
        System.out.println("Congratulations on making it to the NFL! See player attributes here:");
        System.out.println("\t" + fp1);
    }

}