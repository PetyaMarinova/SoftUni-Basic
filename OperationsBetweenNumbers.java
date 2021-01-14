import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        String operator = scanner.nextLine();

        double result = 0;

        switch (operator) {
            case "+":
                result = n + m;
                break;
            case "-":
                result = n - m;
                break;
            case "*":
                result = n * m;
                break;
            case "/":
                if (m == 0){
                    System.out.printf("Cannot divide %d by zero", n);
                } else {
                    result = (n * 1.0) / m;
                    System.out.printf("%d / %d = %.2f", n, m, result);
                }
                break;

            case "%":
                if (m == 0){
                    System.out.printf("Cannot divide %d by zero", n);
                } else {
                    result = n % m;
                    System.out.printf("%d %% %d = %.0f",n, m, result);
                }
                break;
        }
        if ((!operator.equals("/")) && (!operator.equals("%"))){
            if (result % 2 == 0){
                System.out.printf("%d %s %d = %.0f - even", n, operator, m, result);
            } else {
                System.out.printf("%d %s %d = %.0f - odd", n, operator, m, result);
            }

        }
    }
}
