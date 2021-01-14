import java.rmi.StubNotFoundException;
import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String month = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        double priceStudio = 0;
        double priceApartment = 0;

        switch (month) {
            case "May":
            case "October":
               priceApartment = 65 * nights;
               priceStudio = 50 * nights;
                break;
            case "June":
            case "September":
                priceApartment = 68.70 * nights;
                priceStudio = 75.20 * nights;
                break;
            case "July":
            case "August":
                priceApartment = 77 * nights;
                priceStudio = 76 * nights;
                break;
        }

       if (month.equals("May") || month.equals("October")) {
           if (nights > 7 && nights < 14) {
               priceStudio *= 0.95;
           } else if (nights > 14) {
               priceStudio *= 0.70;
           }
       } else if (month.equals("June") || month.equals("September")) {

                if (nights > 14) {
                priceStudio *= 0.80;
        }}

        if (nights > 14) {
          priceApartment *= 0.9;
        }
        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", priceApartment, priceStudio);
    }
}
