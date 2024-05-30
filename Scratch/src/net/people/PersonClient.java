package net.people;

import java.time.LocalDate;

class  PersonClient {

    public static void main(String[] args) {
        Person p1 = new Person ("Tayo", LocalDate.of(1991, 7, 17));

        // print: <name> is <age> years old
        System.out.printf("%s is %s years old\n", p1.getName(), p1.getAge());

        System.out.println(p1); //toString() automatically called
        System.out.println();

        Person p2 = new Person ("Tayo", LocalDate.of(1991, 7, 17));
        System.out.printf("%s is %s years old\n", p2.getName(), p2.getAge());
        System.out.println(p2);
    }

}
