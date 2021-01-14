import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int peoplePlay = Integer.parseInt(scanner.nextLine());
        double countFirstGroup = 0;
        double countSecond = 0;
        double countThird = 0;
        double countForth = 0;
        double countFifth = 0;
        double countSixth = 0;

        double result = 0;

        for (int i = 1; i <= peoplePlay; i++) {
            int points = Integer.parseInt(scanner.nextLine());

            if (points >= 0 && points <= 9) {
                countFirstGroup += 1;
                result += 0.2 * points;
            } else if (points >= 10 && points <= 19) {
                countSecond += 1;
                result += 0.3 * points;
            } else if (points >= 20 && points <= 29) {
                countThird += 1;
                result += 0.4 * points;
            } else if (points >= 30 && points <= 39) {
                countForth += 1;
                result += 50;
            } else if (points >= 40 && points <= 50) {
                countFifth += 1;
                result += 100;
            } else {
                countSixth += 1;
                result /= 2;
            }
        }
        double percentFirst = countFirstGroup / peoplePlay * 100;
        double percentSecond = countSecond / peoplePlay * 100;
        double percentThird = countThird / peoplePlay * 100;
        double percentForth = countForth / peoplePlay * 100;
        double percentFifth = countFifth / peoplePlay * 100;
        double percentSixth = countSixth / peoplePlay * 100;
        System.out.printf("%.2f%nFrom 0 to 9: %.2f%%%nFrom 10 to 19: %.2f%%%nFrom 20 to 29: %.2f%%%nFrom 30 to 39: %.2f%%%nFrom 40 to 50: %.2f%%%nInvalid numbers: %.2f%%",
                result, percentFirst, percentSecond, percentThird, percentForth, percentFifth, percentSixth);
    }
}
