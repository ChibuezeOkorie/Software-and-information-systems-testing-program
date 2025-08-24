/**
 * VehicleTest.java
 * Test class for Vehicle, Bicycle, Automobile
 * INFO6066 Final Exam
 */

public class VehicleTest {
    public static void main(String[] args) {
        // Step 1: Create Bicycle object with one-arg constructor
        Bicycle bike1 = new Bicycle("speed racer");

        // Step 2: Create Bicycle with four-arg constructor
        Bicycle bike2 = new Bicycle("mountain", "Schwinn", "Frontier", 9);

        // Step 3: Create Automobile with two-arg constructor
        Automobile auto1 = new Automobile("slant 6", 140);

        // Step 4: Create Automobile with four-arg constructor
        Automobile auto2 = new Automobile("v6", 180, "Toyota", "Rav4");

        // Step 5: Test all getters
        System.out.println("Bicycle 1:\n  Type: " + bike1.getBicycleType() + "\n  Make: " + bike1.getMake() + "\n  Model: " + bike1.getModel() + "\n  Rating: " + bike1.getRating());
        System.out.println("\nBicycle 2:\n  Type: " + bike2.getBicycleType() + "\n  Make: " + bike2.getMake() + "\n  Model: " + bike2.getModel() + "\n  Rating: " + bike2.getRating());

        System.out.println("\nAutomobile 1:\n  Make: " + auto1.getMake() + "\n  Model: " + auto1.getModel() + "\n  Engine: " + auto1.getEngine() + "\n  HP: " + auto1.getHP());
        System.out.println("\nAutomobile 2:\n  Make: " + auto2.getMake() + "\n  Model: " + auto2.getModel() + "\n  Engine: " + auto2.getEngine() + "\n  HP: " + auto2.getHP());

        // Step 6: toString output
        System.out.println("\nPrinting the toString methods for each object:\n");
        System.out.println(bike1.toString());
        System.out.println("\n" + bike2.toString());
        System.out.println("\n" + auto1.toString());
        System.out.println("\n" + auto2.toString());

        // Step 7: Modify bike1
        bike1.setMake("CCM");
        bike1.setModel("Weston");
        bike1.setBicycleType("Comfort");

        System.out.println("\nRefurbishing bicycle 1:\n");
        System.out.println("Bicycle 1:\n  Type: " + bike1.getBicycleType() + "\n  Make: " + bike1.getMake() + "\n  Model: " + bike1.getModel());

        // Step 8: Demonstrate polymorphism
        System.out.println("\nDemonstrating polymorphism:\n");
        Vehicle[] vehicleArray = {bike1, bike2, auto1, auto2};
        for (Vehicle v : vehicleArray) {
            System.out.println(v.describeVehicle());
            System.out.println(v.rateQuality() + "\n");
        }
    }
}

