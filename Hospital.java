import java.util.Scanner;

public class Hospital {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nDays = Integer.parseInt(scanner.nextLine());
        int patientsSeen = 0;
        int patientsUnseen = 0;
        int doctors = 7;

        for (int i = 1; i <= nDays; i++) {
            int patientPerDay = Integer.parseInt(scanner.nextLine());

            if (i % 3 == 0 && patientsSeen < patientsUnseen) {
                doctors++;
            }
            if (patientPerDay > doctors) {
                patientsSeen += doctors;
                patientsUnseen += patientPerDay - doctors;
            } else {
                patientsSeen += patientPerDay;
            }
        }
        System.out.printf("Treated patients: %d.%n", patientsSeen);
        System.out.printf("Untreated patients: %d.", patientsUnseen);
    }
}

