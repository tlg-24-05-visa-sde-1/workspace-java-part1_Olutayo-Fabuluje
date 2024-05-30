package AnyGiven.Sunday.client;

import AnyGiven.Sunday.FootballPlayer;
import AnyGiven.Sunday.Position;

public class FootballPlayerClient {

    public static void main(String[] args) {

        FootballPlayer player1 = new FootballPlayer("Ravens");
        player1.strength = 12;
        player1.speed = 4.37;
        player1.age = 19;
        player1.setPosition(Position.QUARTERBACK);


        FootballPlayer player2 = new FootballPlayer("Cowboys", 12,
                4.4, 16, Position.RUNNING_BACK);


        FootballPlayer player3 = new FootballPlayer("Chiefs", 14,
                4.61, 19, Position.TIGHT_END);


        FootballPlayer player4 = new FootballPlayer("Raiders", 38,
                4.5, 20, Position.DEFENSIVE_END);


        // NFL Combine Measure of Speed and Strength

        player1.bench();
        player1.dash();

        player2.bench();
        player2.dash();

        player3.bench();
        player3.dash();

        player4.bench();
        player4.dash();


        // Live Game Actions

        // Quarterback

        player1.throwPass();
        // player1.run();
        // player1.catchPass();

        // Runningback

        // player2.throwPass();
        player2.run();
        // player2.catchPass();

        // Tight End

        // player3.throwPass();
        // player3.run();
        player3.catchPass();

        // Defensive End

        // player4.throwPass();
        // player4.run();
        // player4.catchPass();
        player4.sack();


    }
}
