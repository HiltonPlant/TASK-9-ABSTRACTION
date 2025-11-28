public class Main {
    public static void main(String[] args) {

        Crop maize = new Maize("Hybrid Maize", 120, "Longe 10H", 2.5);
        Crop beans = new Beans("NABE Beans", 70, "Red Kidney", true);

        maize.displayDetails();
        beans.displayDetails();

        System.out.println("\nYield for Maize (5kg fertilizer): " + maize.computeYield(5) + " kg");
        System.out.println("Yield for Beans (3kg fertilizer): " + beans.computeYield(3) + " kg");
    }
}