import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double timeSecondPerMeter = Double.parseDouble(scanner.nextLine());

        double scoreIvan = timeSecondPerMeter * distanceMeters;
        double resistance = Math.floor(distanceMeters/15);
        double timeIvan = ((resistance * 12.5) + scoreIvan);

        if (timeIvan < recordSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", timeIvan);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", timeIvan - recordSeconds);
        }
        }



    }

