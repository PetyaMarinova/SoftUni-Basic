import java.util.Scanner;

public class toyShopSecondTry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double priceTrip = Double.parseDouble(scanner.nextLine());
        int countPuzzles = Integer.parseInt(scanner.nextLine());
        int countDoll = Integer.parseInt(scanner.nextLine());
        int countTeddy = Integer.parseInt(scanner.nextLine());
        int countMinions = Integer.parseInt(scanner.nextLine());
        int countTracks = Integer.parseInt(scanner.nextLine());

double priceAll = (countPuzzles * 2.60) + (countDoll * 3.00) + (countMinions * 8.20) + (countTeddy * 4.10) + (countTracks * 2.00);
double countAll = countDoll + countMinions + countPuzzles + countTeddy + countTracks;
        if (countAll >= 50) {
            priceAll = priceAll - (priceAll * 0.25);
        }
        double moneyTotal = priceAll - (priceAll * 0.10);
        double moneyLeft = Math.abs(moneyTotal - priceTrip);


        if (moneyTotal >= priceTrip) {
            System.out.printf("Yes! %.2f lv left.", moneyLeft);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", moneyLeft);
        }
        }
    }

