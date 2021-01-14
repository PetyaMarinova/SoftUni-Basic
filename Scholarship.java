import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double income = Double.parseDouble(scanner.nextLine());
        double averageGrade = Double.parseDouble(scanner.nextLine());
        double minSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship = 0;
        double gradeScholarship = 0;

        if (income < minSalary && averageGrade > 4.50) {
            socialScholarship = minSalary * 0.35;
        }

        if (averageGrade >= 5.50) {
            gradeScholarship = averageGrade * 25;
        }

        if (socialScholarship > gradeScholarship) {
            socialScholarship = Math.floor(socialScholarship);
            System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);

        } else if (gradeScholarship > socialScholarship) {
            gradeScholarship = Math.floor(gradeScholarship);

            System.out.printf("You get a scholarship for excellent results %.0f BGN", gradeScholarship);
        } else {
            System.out.printf("You cannot get a scholarship!");
        }
        }
    }

