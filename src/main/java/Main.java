import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CostCalculator costCalculator = new CostCalculator();
        System.out.println("Welcome to the trip cost calculator!");
        do {
            System.out.print("\nEnter the distance in km: ");
            double distance = sc.nextDouble();
            costCalculator.setDistance(distance);
            System.out.print("Enter the fuel price per liter: ");
            double fuelPrice = sc.nextDouble();
            costCalculator.setFuelPrice(fuelPrice);
            System.out.println("\nCalculating the cost of the trip...");
            System.out.println(costCalculator.display());
            System.out.print("\nDo you want to calculate the cost of another trip? (y/n) ");
        } while (sc.next().equals("y"));
    }
}
