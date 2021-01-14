import java.util.Scanner;

public class Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countVehicles = Integer.parseInt(scanner.nextLine());
        double minibusMoney = 0;
        double truckMoney = 0;
        double trainMoney = 0;
        int countAllLoad = 0;
        double percentMinibus = 0;
        double percentTruck = 0;
        double percentTrain = 0;
        double countAverage = 0;

        for (int i = 1; i <= countVehicles; i++) {

            int weightLoad = Integer.parseInt(scanner.nextLine());
            countAllLoad += weightLoad;

            if (weightLoad <= 3) {
                minibusMoney += weightLoad * 200;

            } else if (weightLoad <= 11) {
                truckMoney += weightLoad * 175;
            } else {
                trainMoney += weightLoad * 120;
            }
        }
        countAverage = (minibusMoney + truckMoney +trainMoney) / countAllLoad;
        percentMinibus = ((minibusMoney / 200) / countAllLoad) * 100;
        percentTruck = ((truckMoney / 175) / countAllLoad) * 100;
        percentTrain = ((trainMoney / 120) / countAllLoad) * 100;
        System.out.printf("%.2f%n%.2f%%%n%.2f%%%n%.2f%%", countAverage, percentMinibus, percentTruck, percentTrain);
    }
}
