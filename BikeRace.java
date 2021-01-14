import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countJunior = Integer.parseInt(scanner.nextLine());
        int countSenior = Integer.parseInt(scanner.nextLine());
        String trail = scanner.nextLine();

        double priceJunior = 0;
        double priceSenior = 0;
        double fee = 0;

        switch (trail) {
            case "trail":
                priceJunior = 5.50 * countJunior;
                priceSenior = 7 * countSenior;
                fee = priceJunior + priceSenior;
                break;
            case "cross-country":
                priceJunior = 8 * countJunior;
                priceSenior = 9.50 * countSenior;
                if ((countJunior + countSenior) >= 50) {
                    fee = priceJunior + priceSenior;
                    fee *= 0.75;
                } else {
                    fee = priceJunior + priceSenior;
                }
                break;
            case "downhill":
                priceJunior = 12.25 * countJunior;
                priceSenior = 13.75 * countSenior;
                fee = priceJunior + priceSenior;
                break;
            case "road":
                priceJunior = 20 * countJunior;
                priceSenior = 21.50 * countSenior;
                fee = priceJunior + priceSenior;
                break;
        }
        fee *= 0.95;
        System.out.printf("%.2f", fee);

    }
}
