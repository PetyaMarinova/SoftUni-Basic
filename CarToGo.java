import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String classCar = "";
        String car = "";
        double price = 0;

        if (budget <= 100) {
            classCar = "Economy class";
            if (season.equals("Summer")) {
                car = "Cabrio";
                price = 0.35 * budget;
            } else if (season.equals("Winter")) {
                car = "Jeep";
                price = 0.65 * budget;
            }
        } else if (budget > 100 && budget <= 500){
            classCar = "Compact class";
            if (season.equals("Summer")) {
                car = "Cabrio";
                price = 0.45 * budget;
            } else if (season.equals("Winter")) {
                car = "Jeep";
                price = 0.80 * budget;
            }
        } else if (budget > 500) {
            classCar = "Luxury class";
            car = "Jeep";
            price = 0.9 * budget;
        }
        System.out.printf("%s%n%s - %.2f", classCar, car, price);
    }

}
