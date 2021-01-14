import java.util.Scanner;

public class FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFuel = scanner.nextLine();
        double litresFuel = Double.parseDouble(scanner.nextLine());

        switch (typeFuel) {
            case "Diesel":
                if (litresFuel >= 25){
                    System.out.printf("You have enough %s.", typeFuel.toLowerCase());
                } else if (litresFuel <25){
                    System.out.printf("Fill your tank with %s!", typeFuel.toLowerCase());
                } else {
                    System.out.printf("Invalid fuel!");
                }
                break;
            case "Gasoline":
                if (litresFuel >= 25){
                    System.out.printf("You have enough %s.", typeFuel.toLowerCase());
                } else if (litresFuel < 25){
                    System.out.printf("Fill your tank with %s!", typeFuel.toLowerCase());
                } else {
                    System.out.printf("Invalid fuel!");
                }
                break;
            case "Gas":
                if (litresFuel >= 25){
                    System.out.printf("You have enough %s.", typeFuel.toLowerCase());
                } else if (litresFuel <25){
                    System.out.printf("Fill your tank with %s!", typeFuel.toLowerCase());
                } else {
                    System.out.printf("Invalid fuel!");
                }
                break;
            default:
                System.out.printf("Invalid fuel!");
        }
    }
}
