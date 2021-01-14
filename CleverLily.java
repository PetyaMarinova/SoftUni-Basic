import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int age = Integer.parseInt(scanner.nextLine());
        double priceWashingMachine = Double.parseDouble(scanner.nextLine());
        int toyPrice = Integer.parseInt(scanner.nextLine());

        int countOddYear = 0;
        double moneyPerYear = 0;
        double sumMoney = 0;

        for (int i = 1; i <= age; i++) {

            if (i % 2 != 0) {
                countOddYear++;
            } else {
                moneyPerYear = moneyPerYear + 10;
                sumMoney = sumMoney + moneyPerYear - 1;

            }
        }

        double sumToys = countOddYear * toyPrice;
        double allMoney = sumToys + sumMoney;

        double diff = Math.abs(priceWashingMachine - allMoney);
        if (allMoney >= priceWashingMachine) {
            System.out.printf("Yes! %.2f", diff);
        } else {
            System.out.printf("No! %.2f", diff);
        }

    }
}
