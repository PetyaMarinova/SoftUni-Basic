import java.util.Scanner;

public class MathCeilMathFloor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

double num = Double.parseDouble(scanner.nextLine());

        double ceilNum = Math.ceil(num);

        System.out.println(ceilNum);

    }
}
