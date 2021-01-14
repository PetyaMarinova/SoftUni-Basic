import java.util.Scanner;

public class Firm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hoursNeeded = Integer.parseInt(scanner.nextLine());
        int daysAvailable = Integer.parseInt(scanner.nextLine());
        int countWorkersOverWork = Integer.parseInt(scanner.nextLine());

        double daysEducating = 0.10 * daysAvailable;
        double daysForWorking = daysAvailable - daysEducating;
        double hoursNormalDay = daysForWorking * 8;
        double extraWork = countWorkersOverWork * 2 * daysAvailable;

        double hoursWorkingTotal = Math.floor(hoursNormalDay + extraWork);

        if (hoursNeeded <= hoursWorkingTotal) {
            double hoursLeft = Math.abs(hoursNeeded - hoursWorkingTotal);
            System.out.printf("Yes!%.0f hours left.", hoursLeft);
        } else {
            double hoursMore = Math.abs(hoursWorkingTotal - hoursNeeded);
            System.out.printf("Not enough time!%.0f hours needed.", hoursMore);
        }
    }
}
