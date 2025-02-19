package Hehe;

public class RentalDetails {
    private static RentalDetails instance; // Singleton instance

    private String carName, make, model;
    private int year;
    private double price, totalCost;

    // Private constructor
    private RentalDetails() {}

    // ✅ Singleton pattern
    public static RentalDetails getInstance() {
        if (instance == null) {
            instance = new RentalDetails();
        }
        return instance;
    }

    // ✅ Set rental details
    public void setDetails(String carName, String make, String model, int year, double price, double totalCost) {
        this.carName = carName;
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
        this.totalCost = totalCost;
    }

    // ✅ Getters
    public String getCarName() { return carName; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public double getPrice() { return price; }
    public double getTotalCost() { return totalCost; }
}