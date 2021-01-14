import java.util.Scanner;

public class Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int foodLeftKg = Integer.parseInt(scanner.nextLine());
        double dogFoodKg = Double.parseDouble(scanner.nextLine());
        double catFoodKg = Double.parseDouble(scanner.nextLine());
        double turtleFoodGradms = Double.parseDouble(scanner.nextLine());

        double turtleFoodKg = turtleFoodGradms / 1000;

        double foodTotal = (days * (dogFoodKg + catFoodKg + turtleFoodKg));

        if (foodLeftKg >= foodTotal) {
            double foodLeft = Math.floor(foodLeftKg - foodTotal);
            System.out.printf("%.0f kilos of food left.", foodLeft);
        } else {
            double foodMore = Math.ceil(foodTotal - foodLeftKg);
            System.out.printf("%.0f more kilos of food are needed.", foodMore);
        }
    }
}
