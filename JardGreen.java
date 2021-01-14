package com.company;

import java.util.Scanner;

public class JardGreen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double green = Double.parseDouble(scanner.nextLine());
        double pricegreen = green * 7.61;
        double discount = 0.18 * pricegreen;
        double result = pricegreen - discount;
        System.out.printf("The final price is: %f lv. The discount is: %f lv. ", result, discount);

    }
}
