package misc.test;

class WrappersTest {

    public static void main(String[] args) {
        String ageInput = "30";
        int age = Integer.parseInt(ageInput);  // Takes "30" and returns int 30
        Integer ageInteger = Integer.valueOf(age);  // returns an Integer with a 30 Inside

        String populationInput = "8000000000";
        long population = Long.parseLong(populationInput);  // returns primitive long
        Long populationLong = Long.valueOf(population);  // returns long object

        String sizeInput = "9.5";
        double size = Double.parseDouble(sizeInput);   // returns primitive double
        Double sizeDouble = Double.valueOf(sizeInput);   // returns Double object


        String isRainingInput = "true";
        boolean isRaining = Boolean.parseBoolean(isRainingInput);  // returns primitive boolean
        Boolean isRainingBoolean = Boolean.valueOf(isRaining);   //returns Boolean object
    }
}