import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String country = "";
        String place = "";
        double price = 0;

        if (budget <= 1000){
            place = "Camp";
            if (season.equals("Summer")){
                country = "Alaska";
                price = 0.65 * budget;
            } else if (season.equals("Winter")){
                country = "Morocco";
                price = 0.45 * budget;
            }
        } else if (budget > 1000 && budget <= 3000){
            place = "Hut";
            if (season.equals("Summer")){
                country = "Alaska";
                price = 0.80 * budget;
            } else if (season.equals("Winter")){
                country = "Morocco";
                price = 0.60 * budget;
            }
        } else if (budget > 3000){
            place = "Hotel";
            price = 0.90 * budget;
            if (season.equals("Summer")){
                country = "Alaska";
            } else if (season.equals("Winter")){
                country = "Morocco";
            }
        }
        System.out.printf("%s - %s - %.2f", country, place, price);


    }
}
