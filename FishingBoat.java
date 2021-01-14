import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        int countFishermen = Integer.parseInt(scanner.nextLine());
        double priceBoatRent = 0;

        switch (season) {
            case "Spring":
                priceBoatRent = 3000;
                break;
            case "Summer":
            case "Autumn":
                priceBoatRent = 4200;
                break;
            case "Winter":
                priceBoatRent = 2600;
                break;
        }

        if (countFishermen <= 6) {
           priceBoatRent *= 0.9;
        } else if (countFishermen>6 && countFishermen <= 11 ) {
            priceBoatRent *= 0.85;
        } else if (countFishermen > 11){
            priceBoatRent *= 0.75;
        }

        if ((countFishermen % 2 == 0) && (!season.equals("Autumn"))) {
            priceBoatRent *= 0.95;
        }
        if (budget >= priceBoatRent) {
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - priceBoatRent));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - priceBoatRent));
        }
    }
}
