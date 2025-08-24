/**
 * Automobile.java
 * Subclass of Vehicle
 * INFO6066 Final Exam
 */

public class Automobile extends Vehicle {
    private String engine;
    private int horsepower;

    // Two-argument constructor
    public Automobile(String engine, int hPower) {
        super("Automobile");
        this.engine = engine;
        this.horsepower = hPower;
    }

    // Four-argument constructor
    public Automobile(String engine, int hPower, String make, String model) {
        super("Automobile", make, model);
        this.engine = engine;
        this.horsepower = hPower;
    }

    public String getEngine() { return engine; }
    public int getHP() { return horsepower; }

    public void setEngine(String engine) { this.engine = engine; }
    public void setHP(int hPower) { this.horsepower = hPower; }

    @Override
    public String describeVehicle() {
        return "This vehicle is a(n) " + getMake() + " " + getModel() + " which is powered by an engine and steered by a driver.\nIt requires 100 percent attention when driving and needs gasoline to fuel the engine.";
    }

    @Override
    public String rateQuality() {
        if (horsepower < 150) return "The quality of this " + getMake() + " " + getModel() + " is considered substandard.";
        else if (horsepower < 200) return "The quality of this " + getMake() + " " + getModel() + " is considered standard.";
        else if (horsepower < 250) return "The quality of this " + getMake() + " " + getModel() + " is considered good.";
        else return "The quality of this " + getMake() + " " + getModel() + " is considered excellent.";
    }

    @Override
    public String toString() {
        return super.toString() + "\nThis automobile has a " + engine + " engine with " + horsepower + " horsepower.";
    }
}

