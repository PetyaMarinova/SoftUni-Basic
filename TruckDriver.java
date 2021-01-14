import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kmPerMonth = Double.parseDouble(scanner.nextLine());
        double price = 0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (kmPerMonth <= 5000){
                    price = kmPerMonth * 0.75 * 4;
                } else if (kmPerMonth > 5000 && kmPerMonth <= 10000){
                    price = kmPerMonth * 0.95 * 4;
                } else if (kmPerMonth > 10000 && kmPerMonth <=20000){
                    price = kmPerMonth * 1.45 * 4;
                }
                break;
            case "Summer":
                if (kmPerMonth <= 5000){
                    price = kmPerMonth * 0.90 * 4;
                } else if (kmPerMonth > 5000 && kmPerMonth <= 10000){
                    price = kmPerMonth * 1.10 * 4;
                } else if (kmPerMonth > 10000 && kmPerMonth <=20000){
                    price = kmPerMonth * 1.45 * 4;
                }
                break;
            case "Winter":
                if (kmPerMonth <= 5000){
                    price = kmPerMonth * 1.05 * 4;
                } else if (kmPerMonth > 5000 && kmPerMonth <= 10000){
                    price = kmPerMonth * 1.25 * 4;
                } else if (kmPerMonth > 10000 && kmPerMonth <=20000){
                    price = kmPerMonth * 1.45 * 4;
                }
                break;
        }
        price *= 0.9;
        System.out.printf("%.2f",price);
    }

}
