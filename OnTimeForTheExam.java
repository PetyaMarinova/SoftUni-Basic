import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int examStartHour = Integer.parseInt(scanner.nextLine());
        int examStartMinute = Integer.parseInt(scanner.nextLine());
        int hourArrive = Integer.parseInt(scanner.nextLine());
        int minuteArrive = Integer.parseInt(scanner.nextLine());

        int examHoursToMinutes = examStartHour * 60;
        int examMinutes = examHoursToMinutes + examStartMinute;

        int arriveHoursToMinutes = hourArrive * 60;
        int arriveMinutes = arriveHoursToMinutes + minuteArrive;

        int differenceMinutesBetweenExamArrive = Math.abs(arriveMinutes - examMinutes);
        int onTime = Math.abs(examMinutes - arriveMinutes);

        int late = arriveMinutes - examMinutes;


        if (examMinutes == arriveMinutes) {
            System.out.printf("On time");
        } else if (examMinutes > arriveMinutes) {
            if (onTime <= 30) {
                System.out.printf("On time %n%d minutes before the start", onTime);
            } else if (onTime > 30 && onTime <= 59) {
                System.out.printf("Early %n%d minutes before the start", onTime);
            } else if (onTime > 59) {
                int hoursEarly = onTime / 60;
                int minutesEarly = onTime % 60;
                System.out.printf("Early %n%d:%02d hours before the start", hoursEarly, minutesEarly);
            }
        } else if (examMinutes < arriveMinutes) {
            if (late >= 1 && late <= 59) {
                System.out.printf("Late %d minutes after the start", late);
            } else if (late > 59) {
                int hoursLate = late / 60;
                int minutesLate = late % 60;
                System.out.printf("Late %n%d:%02d hours after the start", hoursLate, minutesLate);
            }
        }


//        •	Първият ред съдържа час на изпита – цяло число от 0 до 23.
//•	Вторият ред съдържа минута на изпита – цяло число от 0 до 59.
//•	Третият ред съдържа час на пристигане – цяло число от 0 до 23.
//•	Четвъртият ред съдържа минута на пристигане – цяло число от 0 до 59.

    }
}
