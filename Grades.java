import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countStudents = Integer.parseInt(scanner.nextLine());
        double countTop = 0;
        double countBetween4and5 = 0;
        double countBetween4and3 = 0;
        double countFail = 0;
        double percentTop = 0;
        double percentBetween4and5 = 0;
        double percentBetween4and3 = 0;
        double percentFail = 0;

        double averageGrade = 0;


        for (int i = 1; i <= countStudents; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
            averageGrade += grade / countStudents;

            if (grade >= 2 && grade <= 2.99) {
                countFail += 1;
            } else if (grade >= 3 && grade <= 3.99) {
                countBetween4and3 += 1;
            } else if (grade >= 4 && grade <= 4.99) {
                countBetween4and5 += 1;
            } else if (grade >= 5) {
                countTop += 1;
            }
        }
        percentTop = (countTop / countStudents) * 100;
        percentBetween4and5 = (countBetween4and5 / countStudents) * 100;
        percentBetween4and3 = (countBetween4and3 / countStudents) * 100;
        percentFail = (countFail / countStudents) * 100;
        System.out.printf("Top students: %.2f%%%nBetween 4.00 and 4.99: %.2f%%%nBetween 3.00 and 3.99: %.2f%%%nFail: %.2f%%%nAverage: %.2f%%", percentTop, percentBetween4and5, percentBetween4and3, percentFail, averageGrade);
    }
}
