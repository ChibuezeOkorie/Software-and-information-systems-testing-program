/**
 * Bicycle.java
 * Subclass of Vehicle
 * INFO6066 Final Exam
 */

public class Bicycle extends Vehicle {
    private String bicycleType;
    private int rating;

    // One-argument constructor
    public Bicycle(String bType) {
        super("Bicycle");
        this.bicycleType = bType;
        this.rating = 1;
    }

    // Four-argument constructor
    public Bicycle(String bType, String make, String model, int rating) {
        super("Bicycle", make, model);
        this.bicycleType = bType;
        this.rating = rating;
    }

    public String getBicycleType() { return bicycleType; }
    public int getRating() { return rating; }

    public void setBicycleType(String bType) { this.bicycleType = bType; }
    public void setRating(int rating) { this.rating = rating; }

    @Override
    public String describeVehicle() {
        return "This vehicle is a " + getMake() + " " + getModel() + " bicycle which provides two wheeled transportation powered by the movement of the legs of the passenger.";
    }

    @Override
    public String rateQuality() {
        if (rating <= 2) return "This bicycle has been determined to be of poor quality.";
        else if (rating <= 5) return "This bicycle has been determined to be of moderate quality.";
        else if (rating <= 8) return "This bicycle has been determined to be of good quality.";
        else return "This bicycle has been determined to be of excellent quality.";
    }

    @Override
    public String toString() {
        return super.toString() + "\nThis " + bicycleType + " bicycle has a rating of " + rating + ".";
    }
}

