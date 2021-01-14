import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countChrysanthemum = Integer.parseInt(scanner.nextLine());
        int countRoses = Integer.parseInt(scanner.nextLine());
        int countTulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        String holiday = scanner.nextLine();

        double priceFlowers = 0;

        switch (season){
            case "Spring":
            case "Summer":
                priceFlowers = 2 * countChrysanthemum + 4.10 * countRoses + 2.50 * countTulips;
                break;
            case "Autumn":
            case "Winter":
                priceFlowers = 3.75 * countChrysanthemum + 4.50 * countRoses + 4.15 * countTulips;
                break;
        }

        if (holiday.equals("Y")){
            priceFlowers *= 1.15;
        }

        if (countTulips > 7 && season.equals("Spring")){
            priceFlowers *= 0.95;
        } else if (countRoses >= 10 && season.equals("Winter")){
            priceFlowers *= 0.90;
        }

        if ((countChrysanthemum + countRoses + countTulips) > 20) {
            priceFlowers *= 0.80;
        }

        priceFlowers += 2;
        System.out.printf("%.2f", priceFlowers);

    }
}
