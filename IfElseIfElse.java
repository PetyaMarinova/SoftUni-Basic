import java.util.Scanner;

public class IfElseIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = 7;

        if (num > 4) {
            System.out.println("Bigger than 4");
        } else if (num > 5) {
            System.out.println("Bigger than 5");
        } else {
            System.out.println("Equal to 7");
        }
    }
}
