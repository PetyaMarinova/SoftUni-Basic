import java.util.Scanner;

public class FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int countFen = Integer.parseInt(scanner.nextLine());

        double countFenA = 0;
        double countFenB = 0;
        double countFenV = 0;
        double countFenG = 0;


        for (int i = 1; i <= countFen; i++) {
            String sector = scanner.nextLine();

            if (sector.equals("A")) {
                countFenA += 1;
            } else if (sector.equals("B")) {
                countFenB += 1;
            } else if (sector.equals("V")) {
                countFenV += 1;
            } else if (sector.equals("G")) {
                countFenG += 1;
            }
        }
        double percentFenA = countFenA / countFen * 100;
        double percentFenB = countFenB / countFen * 100;
        double percentFenV = countFenV / countFen * 100;
        double percentFenG = countFenG / countFen * 100;
        double percentAll = countFen * 1.0 / stadiumCapacity * 100;
        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%", percentFenA, percentFenB, percentFenV, percentFenG, percentAll);

    }
}
