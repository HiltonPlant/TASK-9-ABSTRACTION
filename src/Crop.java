// Abstract class
abstract class Crop {

    protected String name;
    protected double growthDuration; // days

    public Crop(String name, double growthDuration) {
        this.name = name;
        this.growthDuration = growthDuration;
    }

}