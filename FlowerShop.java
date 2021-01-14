import java.util.Scanner;

public class FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int magnolias = Integer.parseInt(scanner.nextLine());
        int hyacinths = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int cacti = Integer.parseInt(scanner.nextLine());
        double pricePresent = Double.parseDouble(scanner.nextLine());

        double moneyWithTaxes = (magnolias * 3.25) + (hyacinths * 4) + (roses * 3.5) + (cacti * 8);
        double moneySheHas = moneyWithTaxes - (moneyWithTaxes * 0.05);

        if (moneySheHas >= pricePresent) {
            double moneyLeft = Math.floor(moneySheHas - pricePresent);
            System.out.printf("She is left with %.0f leva.", moneyLeft);
        } else {
            double moneyMore = Math.ceil(pricePresent - moneySheHas);
            System.out.printf("She will have to borrow %.0f leva.", moneyMore);
        }

    }
}
