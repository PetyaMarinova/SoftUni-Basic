import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int widthFreeSpace = Integer.parseInt(scanner.nextLine());
        int lengthFreeSpace = Integer.parseInt(scanner.nextLine());
        int heightFreeSpace = Integer.parseInt(scanner.nextLine());
        String countBoxes = scanner.nextLine();

        int volumeApartment = widthFreeSpace * lengthFreeSpace * heightFreeSpace;
        boolean outOfSpace = false;

        while (!countBoxes.equals("Done")) {
            int currentBox = Integer.parseInt(countBoxes);
            volumeApartment = volumeApartment - currentBox;

            if (volumeApartment <= 0){
                outOfSpace = true;
                break;
            }
            countBoxes = scanner.nextLine();
        }

        if (outOfSpace == false){
            System.out.printf("%d Cubic meters left.", volumeApartment);
        } else {
            System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(volumeApartment));
        }

    }

}

