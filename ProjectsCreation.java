package com.company;

import java.util.Scanner;

public class ProjectsCreation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstname = scan.nextLine();
        int projectsquantity = Integer.parseInt(scan.nextLine());
        int hoursneeded = projectsquantity * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", firstname, hoursneeded, projectsquantity);




    }
}
