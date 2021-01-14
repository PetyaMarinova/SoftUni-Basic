import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countLowGrades = Integer.parseInt(scanner.nextLine());
        String nameTask = scanner.nextLine();

        int counterLowGrades = 0;
        int counterAllGrades = 0;
        double sumGrades = 0;
        String lastProblem = "";

        boolean needABreak = false;

        while (!nameTask.equals("Enough")) {
            lastProblem = nameTask;
            int gradePerTask = Integer.parseInt(scanner.nextLine());
            if (gradePerTask <= 4) {
                counterLowGrades++;
                if (counterLowGrades >= countLowGrades) {
                    needABreak = true;
                    break;
                }
            }
            sumGrades = sumGrades + gradePerTask;
            counterAllGrades++;

            nameTask = scanner.nextLine();
        }
        double averageGrade = sumGrades / counterAllGrades;
        if (needABreak) {
            System.out.printf("You need a break, %d poor grades.", counterLowGrades);
        } else {
            System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s", averageGrade, counterAllGrades, lastProblem);
        }
    }
}
