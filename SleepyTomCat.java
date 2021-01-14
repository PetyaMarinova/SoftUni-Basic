import java.util.Scanner;

public class SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysOff = Integer.parseInt(scanner.nextLine());

        int workingDays = 365 - daysOff;
        int minutesPlayDaysOff = daysOff * 127;
        int minutesPlayDaysWorking = workingDays * 63;
        int totalPlayMinutesPerYear = minutesPlayDaysOff + minutesPlayDaysWorking;

        if (totalPlayMinutesPerYear > 30000) {
            int minutesMore = totalPlayMinutesPerYear - 30000;
            int hoursPlayMore = minutesMore / 60;
            int minutesPlayMore = minutesMore % 60;

            System.out.printf("Tom will run away%n %d hours and %d minutes more for play", hoursPlayMore, minutesPlayMore);

        } else if (totalPlayMinutesPerYear < 30000) {

            int minutesLess = 30000 - totalPlayMinutesPerYear ;
            int hoursPlayLess = minutesLess / 60;
            int minutesPlayLess = minutesLess % 60;

            System.out.printf("Tom sleeps well%n %d hours and %d minutes less for play", hoursPlayLess, minutesPlayLess);
        }


    }
}
