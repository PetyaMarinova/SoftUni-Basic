import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String typeTicket = scanner.nextLine();
        int countPeople = Integer.parseInt(scanner.nextLine());

        double price = 0;
        double transport = 0;
        double priceTotal = 0;

        switch (typeTicket) {
            case "Normal":
                price = 249.99 * countPeople;

                if (countPeople >= 1 && countPeople <= 4) {
                    transport = 0.75 * budget;
                } else if (countPeople >= 5 && countPeople <= 9) {
                    transport = 0.60 * budget;
                } else if (countPeople >= 10 && countPeople <= 24) {
                    transport = 0.50 * budget;
                } else if (countPeople >= 25 && countPeople <= 49) {
                    transport = 0.40 * budget;
                } else if (countPeople >= 50) {
                    transport = 0.25 * budget;
                }
                priceTotal = price + transport;
                break;

            case "VIP":
                price = 499.99 * countPeople;

            if (countPeople >= 1 && countPeople <= 4) {
                transport = 0.75 * budget;
            } else if (countPeople >= 5 && countPeople <= 9) {
                transport = 0.60 * budget;
            } else if (countPeople >= 10 && countPeople <= 24) {
                transport = 0.50 * budget;
            } else if (countPeople >= 25 && countPeople <= 49) {
                transport = 0.40 * budget;
            } else if (countPeople >= 50) {
                transport = 0.25 * budget;
            }
            priceTotal = price + transport;
            break;
        }
        if (budget >= priceTotal){
            System.out.printf("Yes! You have %.2f leva left.", Math.abs(budget - priceTotal));
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", Math.abs(budget - priceTotal));
        }

    }
}
