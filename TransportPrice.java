import java.sql.SQLOutput;
import java.util.Scanner;

public class TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nCountKm = Integer.parseInt(scanner.nextLine());
        String dayNight = scanner.nextLine();
        double price = 0.0;

        if (nCountKm >= 100) {
            if (dayNight.equals("day") || dayNight.equals("night")) {
                price = 0.06 * nCountKm;
            }
            System.out.printf("%.2f", price);
        } else if (nCountKm >= 20) {
            if ((dayNight.equals("day")) || (dayNight.equals("night"))) {
                price = 0.09 * nCountKm;
            }
            System.out.printf("%.2f", price);
        } else if (nCountKm > 0) {
            if (dayNight.equals("day")) {
                price = 0.70 + (0.79 * nCountKm);
            } else if (dayNight.equals("night")) {
                price = 0.70 + (0.90 * nCountKm);
            }
            System.out.printf("%.2f", price);
        }

    }
}
