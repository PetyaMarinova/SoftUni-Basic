import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int monthsTotal = Integer.parseInt(scanner.nextLine());

        double electricity = 0;
        double water = 0;
        double internet = 0;
        double others = 0;
        double average = 0;

        for (int i = 1; i <= monthsTotal; i ++){
            double electricityBill = Double.parseDouble(scanner.nextLine());
            electricity += electricityBill;
            water += 20;
            internet += 15;
            others += (electricityBill + 20 + 15) + 0.2 * (electricityBill + 20 + 15);
        }
        average = (electricity + water + internet + others) / monthsTotal;
        System.out.printf("Electricity: %.2f lv%nWater: %.2f lv%nInternet: %.2f lv%nOther: %.2f lv%nAverage: %.2f lv",
                electricity, water, internet, others, average);

    }
}
