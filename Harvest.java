import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double xWineYard = Double.parseDouble(scanner.nextLine());
        double yGrapePerMeter = Double.parseDouble(scanner.nextLine());
        double zWineLitresNeeded = Double.parseDouble(scanner.nextLine());
        double countWorkers = Double.parseDouble(scanner.nextLine());

        double grapeKgTotal = xWineYard * yGrapePerMeter;
        double percentHarvestForWine = 0.4 * grapeKgTotal;

        double litresWine = percentHarvestForWine / 2.5;

        if (litresWine < zWineLitresNeeded) {
            double litresNeeded = Math.floor(zWineLitresNeeded - litresWine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", litresNeeded);
        } else if (litresWine >= zWineLitresNeeded) {
            double litresWineLeft = Math.ceil(litresWine - zWineLitresNeeded);
            double litresPerPerson = Math.ceil(litresWineLeft / countWorkers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n %.0f liters left -> %.0f liters per person.", Math.floor(litresWine), litresWineLeft, litresPerPerson);
        }


    }
}

