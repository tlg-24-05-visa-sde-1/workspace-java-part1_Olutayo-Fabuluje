package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

/*
 * Main-class to create a few instances of Television and give them a test-drive
 */
public class TelevisionClient {

    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances have been created");
        System.out.println();



        // create a Television object and set its properties
        Television tv1 = new Television("Samsung ",Television.MAX_VOLUME, DisplayType.LED);
        System.out.println(tv1);


        // create a 2nd instance of Television and set its properties, also
        Television tv2 = new Television("Sony ",Television.MIN_VOLUME, DisplayType.OLED);
        System.out.println(tv2);


        // create a 3rd instance, BUT do NOT set its properties
        Television tv3 = new Television("Toshiba ",81);
        System.out.println(tv3);




        // call some business methods on them, i.e., turn them "on" and "off"
        tv1.turnOn();
        tv2.turnOn();
        tv3.turnOn();

        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();

        tv1.mute();

        System.out.println(Television.getInstanceCount() + " instances have been created");
        System.out.println();
    }
}