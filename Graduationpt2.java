import java.util.Scanner;

public class Graduationpt2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nameStudent = scanner.nextLine();

        int counterYears = 0;
        int counterPoorGrades = 0;
        double sumGrades = 0;

        while(counterYears != 12){
            double gradeEveryYear = Double.parseDouble(scanner.nextLine());

            if (gradeEveryYear < 4) {
                counterPoorGrades = counterPoorGrades + 1;
                if (counterPoorGrades >= 2) {
                    break;
                }
            }
            sumGrades = sumGrades + gradeEveryYear;
            counterYears = counterYears + 1;

        }
        if (counterYears == 12){
            System.out.printf("%s graduated. Average grade: %.2f", nameStudent,Math.abs(sumGrades / counterYears) );
        } else {
            System.out.printf("%s has been excluded at %d grade",nameStudent, counterYears);
        }

    }
}
