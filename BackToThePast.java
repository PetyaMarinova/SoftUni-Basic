import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double moneyReceived = Double.parseDouble(scanner.nextLine());
        int yearN = Integer.parseInt(scanner.nextLine());
        int countYearsIvan = 18;
        moneyReceived -= 12000;

        for (int i = 1801; i <= yearN; i++) {


            if (i % 2 == 0) {
                countYearsIvan += 1;
                moneyReceived -= 12000;
            } else {
                countYearsIvan += 1;
                moneyReceived = moneyReceived - (12000 + 50 * (countYearsIvan));
            }
        }
        if (moneyReceived >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", Math.abs(moneyReceived));
        } else {
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(moneyReceived));
        }
    }
}
