/**
 * Vehicle.java
 * Superclass for Bicycle and Automobile
 * INFO6066 Final Exam
 */

public abstract class Vehicle {
    private String type;
    private String make;
    private String model;

    // One-argument constructor
    public Vehicle(String type) {
        this.type = type;
        this.make = "unknown";
        this.model = "unknown";
    }

    // Three-argument constructor
    public Vehicle(String type, String make, String model) {
        this.type = type;
        this.make = make;
        this.model = model;
    }

    public String getType() { return type; }
    public String getMake() { return make; }
    public String getModel() { return model; }

    public void setMake(String make) { this.make = make; }
    public void setModel(String model) { this.model = model; }

    public abstract String describeVehicle();
    public abstract String rateQuality();

    @Override
    public String toString() {
        return "This vehicle is a(n) " + type + ". Its make is a(n) " + make + " and the model is a(n) " + model + ".";
    }
}

