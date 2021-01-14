import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double movieBudget = Double.parseDouble(scanner.nextLine());
        int countActors = Integer.parseInt(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());

        double decor = movieBudget * 0.10;
        double priceClothesTotal = countActors * priceClothes;


        if (countActors > 150) {
            priceClothesTotal = priceClothesTotal - (priceClothesTotal * 0.1);
        }

        double totalExpenses = priceClothesTotal + decor;

        double difference = Math.abs(totalExpenses - movieBudget);

        if (totalExpenses <= movieBudget) {
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", difference);
        } else {
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", difference);
        }
    }
}







