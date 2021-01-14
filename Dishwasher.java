import java.util.Scanner;

public class Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countBottlesDetergent = Integer.parseInt(scanner.nextLine());
        String command = scanner.nextLine();

        int detergentMl = 750 * countBottlesDetergent;

        int counterTimesFillingTheDishwasher = 0;
        int counterDishes = 0;
        int counterPots = 0;


        while (!command.equals("End")) {
            int typeDishes = Integer.parseInt(command);
            counterTimesFillingTheDishwasher++;
            

                if (counterTimesFillingTheDishwasher % 3 == 0) {
                    counterPots = counterPots + typeDishes;
                    detergentMl = detergentMl - (typeDishes * 15);
                    if (detergentMl < 0){
                        break;
                    }
                } else {
                    counterDishes = counterDishes + typeDishes;
                    detergentMl = detergentMl - (typeDishes * 5);
                    if (detergentMl < 0){
                        break;
                    }
                }

            command = scanner.nextLine();
        }

        if (detergentMl >= 0) {
            System.out.printf("Detergent was enough!%n%d dishes and %d pots were washed.%nLeftover detergent %d ml.%n", counterDishes, counterPots, detergentMl);
        } else {
            System.out.printf("Not enough detergent, %d ml. more necessary!", Math.abs(detergentMl));
        }
    }
}
