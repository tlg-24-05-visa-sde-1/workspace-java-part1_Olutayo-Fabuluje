package misc.test;

class StringTest {

    public static void main(String[] args) {
        String city1 = "new york";
        String city2 = "new york";

        System.out.println(city1.equals(city2));   // THIS IS WHAT YOU SHOULD DO
        System.out.println(city1 == city2);        // THIS IS THE "WRONG" WAY TO DO IT

        System.out.println();

        String newCity1 = city1.substring(0,3);  // "new"
        String newCity2 = city2.substring(0,3);  // "new"

        System.out.println(newCity1.equals(newCity2));  // CORRECT WAY
        System.out.println(newCity1 == newCity2);       // Incorrect Way
        System.out.println();

        String greeting = "What's up \"Doc?\"";
        System.out.println(greeting);
        System.out.println();

        System.out.println("roses are red\nviolets are blue");
        System.out.println();

        String poem = """
                Sugar is sweet
                and so are you""";
        System.out.println(poem);
        System.out.println();


        String pattern = "\\d{3}[A-Z]{3}|[A-Z]\\d{3}[A-Z]{3}";
        String plate1 = "637YOC";
        String plate2 = "A123XYZ";
        String plate3 = "FABULUJE";
        System.out.println("This license plate is valid: " + plate1.matches(pattern));
        System.out.println("This license plate is valid: " + plate2.matches(pattern));
        System.out.println("This license plate is valid: " + plate3.matches(pattern));




    }
}