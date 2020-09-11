public class SharedHello {

    public static void main(String[] args) {

        // Display message Welcome to Java! on the console
        System.out.println("Welcome to Java!");
        // Skrevet af Jens
        hej("Jens");
        godDag("Jens");

        // Skrevet af Lukas



        // Skrevet af Asta
        hej("Asta");
        godDag("Asta");
    }

    // Her er et eksempel på en metode
    public static void hej(String navn) {
        System.out.print("Hej " + navn  + "! ");
    }

    // Her er et eksempel på en anden metode
    public static void godDag(String navn) {
        System.out.println("Velkommen og hav en god dag " + navn  + "!");
    }

}
