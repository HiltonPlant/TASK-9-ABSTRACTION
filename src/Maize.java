class Maize extends Crop {

    private String variety;
    private double averageHeight;

    public Maize(String name, double growthDuration, String variety, double averageHeight) {
        super(name, growthDuration);
        this.variety = variety;
        this.averageHeight = averageHeight;
    }

    @Override
    public void displayDetails() {
        System.out.println("------ Maize Crop ------");
        System.out.println("Name: " + name);
        System.out.println("Growth Duration: " + growthDuration + " days");
        System.out.println("Variety: " + variety);
        System.out.println("Average Height: " + averageHeight + " m");
    }
}