import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hour = Integer.parseInt(scanner.nextLine());
        String day = scanner.nextLine();

        if (hour >= 10 && hour <= 18) {
            if (day.equals("Monday")) {
                System.out.println("open");
            } else if (day.equals("Tuesday")){
                System.out.println("open");
            } else if (day.equals("Wednesday")) {
                System.out.println("open");
            } else if (day.equals("Thursday")) {
                System.out.println("open");
            } else if (day.equals("Friday")) {
                System.out.println("open");
            } else if (day.equals("Saturday")){
                System.out.println("open");
            } else if (day.equals("Sunday")) {
                System.out.println("closed");
            }
        } else {
            System.out.println("closed");
        }
    }
}
