class Beans extends Crop {

    private String colorType;
    private boolean climbingType;

    public Beans(String name, double growthDuration, String colorType, boolean climbingType) {
        super(name, growthDuration);
        this.colorType = colorType;
        this.climbingType = climbingType;
    }

    @Override
    public void displayDetails() {
        System.out.println("------ Beans Crop ------");
        System.out.println("Name: " + name);
        System.out.println("Growth Duration: " + growthDuration + " days");
        System.out.println("Color Type: " + colorType);
        System.out.println("Climbing Type: " + (climbingType ? "Yes" : "No"));
    }
}