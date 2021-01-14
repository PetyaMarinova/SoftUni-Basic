import java.util.Scanner;

public class SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String typeGroup = scanner.nextLine();
        int countStudents = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());

        double price = 0;
        String typeSport = "";

        switch (season) {
            case "Spring":
                if (typeGroup.equals("boys") || typeGroup.equals("girls")) {
                    price = 7.20 * countStudents * nights;
                } else if (typeGroup.equals("mixed")) {
                    price = 9.50 * countStudents * nights;
                }
                break;
            case "Winter":
                if (typeGroup.equals("boys") || typeGroup.equals("girls")) {
                    price = 9.60 * countStudents * nights;
                } else if (typeGroup.equals("mixed")) {
                    price = 10.00 * countStudents * nights;
                }
                break;
            case "Summer":
                if (typeGroup.equals("boys") || typeGroup.equals("girls")) {
                    price = 15.00 * countStudents * nights;
                } else if (typeGroup.equals("mixed")) {
                    price = 20.00 * countStudents * nights;
                }
                break;
        }

        if (countStudents >= 50) {
            price *= 0.5;
        } else if (countStudents < 50 && countStudents >= 20) {
            price *= 0.85;
        } else if (countStudents < 20 && countStudents >= 10) {
            price *= 0.95;
        }

        switch (season) {
            case "Spring":
                if (typeGroup.equals("girls")){
                 typeSport = "Athletics";
                } else if (typeGroup.equals("boys")){
                    typeSport = "Tennis";
                }else if (typeGroup.equals("mixed")){
                    typeSport = "Cycling";
                }
                break;
            case "Winter":
                if (typeGroup.equals("girls")){
                    typeSport = "Gymnastics";
                } else if (typeGroup.equals("boys")){
                    typeSport = "Judo";
                }else if (typeGroup.equals("mixed")){
                    typeSport = "Ski";
                }
                break;
            case "Summer":
                if (typeGroup.equals("girls")){
                    typeSport = "Volleyball";
                } else if (typeGroup.equals("boys")){
                    typeSport = "Football";
                }else if (typeGroup.equals("mixed")){
                    typeSport = "Swimming";
                }
                break;
        }
        System.out.printf("%s %.2f lv.",typeSport, price);
    }
}
