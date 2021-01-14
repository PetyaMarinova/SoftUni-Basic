import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        String typeRoom = scanner.nextLine();
        String feedBack = scanner.nextLine();
        int nights = days - 1;

        double price = 0;
        double totalPrice = 0;

        if (typeRoom.equals("room for one person")) {
                price = nights * 18;
        } else if (typeRoom.equals("apartment")){
            if (days < 10){
                price = (25 * nights) - (0.3 * (25 * nights));
            }else if (days <= 15) {
                price = (25 * nights) - (0.35 * (25 * nights));
            } else {
                price = (25 * nights) - (0.5 * (25 * nights));
            }
        } else if (typeRoom.equals("president apartment")) {
            if (days < 10){
                price = (35 * nights) - (0.1* (35 * nights));
            }else if (days <= 15) {
                price = (35 * nights) - (0.15 * (35 * nights));
            } else {
                price = (35 * nights) - (0.2 * (35 * nights));
            }
            }
        if (feedBack.equals("positive")) {
            totalPrice = price + (0.25 * price);
            System.out.printf("%.2f", totalPrice);
        } else if (feedBack.equals("negative")) {
            totalPrice = price - (0.1 * price);
            System.out.printf("%.2f", totalPrice);
        }
    }
}
