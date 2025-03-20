public class CostCalculator {
    private double distance;
    private double fuelPrice;
    private final double fuelConsumption;

    public CostCalculator() {
        this.fuelConsumption = 5.0/100.0;
    }

    public double fuelNeeded() {
        return distance * fuelConsumption;
    }

    public double cost() {
        return fuelNeeded() * fuelPrice;
    }

    public String display() {
        return String.format("%.2f€", cost());
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setFuelPrice(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }
}
