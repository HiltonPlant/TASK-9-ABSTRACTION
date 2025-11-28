// Abstract class
abstract class Crop {

    protected String name;
    protected double growthDuration; // days

    public Crop(String name, double growthDuration) {
        this.name = name;
        this.growthDuration = growthDuration;
    }

    public abstract void displayDetails();

    public double computeYield(double fertilizerKg) {
        return fertilizerKg * 2.5;
    }
}