import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String town = scanner.nextLine();
        double sSales = Double.parseDouble(scanner.nextLine());
        double commission = 0;

        if (town.equals("Sofia")) {
            if (sSales >= 0 && sSales <= 500) {
                commission = 0.05 * sSales;
                System.out.printf("%.2f", commission);
            } else if (sSales > 500 && sSales <= 1000) {
                commission = 0.07 * sSales;
                System.out.printf("%.2f", commission);
            } else if (sSales > 1000 && sSales <= 10000) {
                commission = 0.08 * sSales;
                System.out.printf("%.2f", commission);
            } else if (sSales > 10000) {
                commission = 0.12 * sSales;
                System.out.printf("%.2f", commission);
            } else {
                System.out.println("error");
            }
        } else if (town.equals("Varna")) {
            if (sSales >= 0 && sSales <= 500) {
                commission = 0.045 * sSales;
                System.out.printf("%.2f", commission);
            } else if (sSales > 500 && sSales <= 1000) {
                commission = 0.075 * sSales;
                System.out.printf("%.2f", commission);
            } else if (sSales > 1000 && sSales <= 10000) {
                commission = 0.10 * sSales;
                System.out.printf("%.2f", commission);
            } else if (sSales > 10000) {
                commission = 0.13 * sSales;
                System.out.printf("%.2f", commission);
            } else {
                System.out.println("error");
            }
        } else if (town.equals("Plovdiv")) {
            if (sSales >= 0 && sSales <= 500) {
                commission = 0.055 * sSales;
                System.out.printf("%.2f", commission);
            } else if (sSales > 500 && sSales <= 1000) {
                commission = 0.08 * sSales;
                System.out.printf("%.2f", commission);
            } else if (sSales > 1000 && sSales <= 10000) {
                commission = 0.12 * sSales;
                System.out.printf("%.2f", commission);
            } else if (sSales > 10000) {
                commission = 0.145 * sSales;
                System.out.printf("%.2f", commission);
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
