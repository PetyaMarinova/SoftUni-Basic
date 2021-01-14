import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String destination = "";
        double journeyPrice = 0;
        String typeTrip = "";

        if (budget <= 100) {
           destination = "Bulgaria";
           if (season.equals("summer")) {
               typeTrip = "Camp";
               journeyPrice = 0.3 * budget;
           } else {
               typeTrip = "Hotel";
               journeyPrice = 0.7 * budget;
           }
        } else if (budget > 100 && budget <= 1000) {
            destination = "Balkans";
            if (season.equals("summer")) {
                typeTrip = "Camp";
                journeyPrice = 0.4 * budget;
            } else {
                typeTrip = "Hotel";
                journeyPrice = 0.8 * budget;
            }
        } else {
            destination = "Europe";
            typeTrip = "Hotel";
            journeyPrice = 0.9 * budget;
        }

        System.out.printf("Somewhere in %s%n%s - %.2f", destination, typeTrip, journeyPrice);
    }
}
