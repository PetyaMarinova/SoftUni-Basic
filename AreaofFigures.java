import java.util.Scanner;

public class AreaofFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String typeFigure = scanner.nextLine();
        double area = 0;

        if (typeFigure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            double areaSquare = a * a;
            System.out.printf("%.3f", areaSquare);
        } else if (typeFigure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double areaRectangle = a * b;
            System.out.printf("%.3f", areaRectangle);
        } else if (typeFigure.equals("circle")) {
            double r = Double.parseDouble(scanner.nextLine());
            double areaCircle = Math.PI * r * r;
            System.out.printf("%.3f", areaCircle);
        } else if (typeFigure.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double areaTriangle = (a * b) / 2;
            System.out.printf("%.3f", areaTriangle);
        }

    }
}



