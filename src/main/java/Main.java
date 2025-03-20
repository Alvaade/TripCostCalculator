import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale locale;
        ResourceBundle rb;
        CostCalculator costCalculator = new CostCalculator();

        System.out.println("Select the language: ");
        System.out.println("1. Farsi");
        System.out.println("2. Finnish");
        System.out.println("3. Japanese");
        int choice = sc.nextInt();

        locale = switch (choice) {
            case 1 -> new Locale("fa", "IR");
            case 2 -> new Locale("fi", "FI");
            case 3 -> new Locale("ja", "JP");
            default -> new Locale("en", "US");
        };

        try {
            rb = ResourceBundle.getBundle("messages", locale);
        } catch (Exception e) {
            System.out.println("Invalid choice. Defaulting to English.");
            rb = ResourceBundle.getBundle("messages", new Locale("en", "US"));
        }
        do {
            System.out.print(rb.getString("kilo"));
            double distance = sc.nextDouble();
            costCalculator.setDistance(distance);
            System.out.print(rb.getString("price"));
            double fuelPrice = sc.nextDouble();
            costCalculator.setFuelPrice(fuelPrice);
            System.out.println(rb.getString("total") + costCalculator.display());
            System.out.println("\n" + rb.getString("new"));
            System.out.println(rb.getString("answer"));
        } while (sc.nextInt() == 1);
    }
}
