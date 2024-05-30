package AnyGiven.Sunday.test;

import AnyGiven.Sunday.FootballPlayer;

class FootballPlayerValidationTest {

    public static void main(String[] args) {

        FootballPlayer p1 = new FootballPlayer();

        p1.setAge(18);
        System.out.println(p1);

        p1.setAge(20);
        System.out.println(p1);

        p1.setAge(25);
        System.out.println(p1);

        p1.setAge(18);
        System.out.println(p1);

        p1.setAge(15);
        System.out.println(p1);

        p1.setAge(10);
        System.out.println(p1);

        p1.setAge(17);
        System.out.println(p1);

        p1.setAge(16);
        System.out.println(p1);


    }
}