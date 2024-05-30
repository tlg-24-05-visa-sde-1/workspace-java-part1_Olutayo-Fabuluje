package com.entertainment.client;

import com.entertainment.Television;

class TelevisionValidationTest {
    public static void main(String[] args) {
        Television tv = new Television();

        tv.setBrand("Samsung");
        System.out.println(tv);

        tv.setBrand("LG");
        System.out.println(tv);

        tv.setBrand("Sony");
        System.out.println(tv);

        tv.setBrand("Asus");
        System.out.println(tv);

        tv.setBrand("Invalid");
        System.out.println(tv);




        tv.setVolume(0);
        System.out.println(tv);

        tv.setVolume(100);
        System.out.println(tv);

        tv.setVolume(-1);
        tv.setVolume(101);
        System.out.println(tv);
    }
}