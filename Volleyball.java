import java.util.Scanner;

public class Volleyball {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeOfYear = scanner.nextLine();
        int countHolidays = Integer.parseInt(scanner.nextLine());
        int weekendHolidays = Integer.parseInt(scanner.nextLine());

        double playDays = (48 - weekendHolidays) * 3.0 / 4 + countHolidays * 2.0 / 3 + weekendHolidays;

        if (typeOfYear.equals("leap")){
            playDays *= 1.15;
        }
        System.out.printf("%.0f",Math.floor(playDays));
    }
}
