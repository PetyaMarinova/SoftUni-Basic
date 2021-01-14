import java.util.Scanner;

public class FuelTankPartTwo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFuel = scanner.nextLine();
        double quantityFuel = Double.parseDouble(scanner.nextLine());
        String cardHolder = scanner.nextLine();
        double price = 0;

        switch (typeFuel) {
            case "Diesel":
                price = 2.33 * quantityFuel;
                if (cardHolder.equals("Yes")){
                    price = price - (0.12 * quantityFuel);
                }
                break;
            case "Gasoline":
                price = 2.22 * quantityFuel;
                if (cardHolder.equals("Yes")){
                    price = price - (0.18 * quantityFuel);
                }
                break;
            case "Gas":
                price = 0.93 * quantityFuel;
                if (cardHolder.equals("Yes")){
                    price = price - (0.08 * quantityFuel);
                }
                break;
        }

        if (quantityFuel >= 20 && quantityFuel <= 25){
            price *= 0.92;
        } else if (quantityFuel > 25) {
            price *= 0.90;
        }

        System.out.printf("%.2f lv.", price);

//        •	Типа на горивото – текст с възможности: "Gas", "Gasoline" или "Diesel"
//•	Количество гориво – реално число в интервала [1.00 … 50.00]
//•	Притежание на клубна карта – текст с възможности: "Yes" или "No"

    }
}
