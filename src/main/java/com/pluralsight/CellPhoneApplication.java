package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CellPhone usersPhone = new CellPhone();

        System.out.print("What is the serial number?: ");
        usersPhone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.print("What model is the phone?: ");
        usersPhone.setModel(scanner.nextLine());
        System.out.print("Who is the carrier?: ");
        usersPhone.setCarrier(scanner.nextLine());
        System.out.print("What is the phone number?: ");
        usersPhone.setPhoneNumber(scanner.nextLine());
        System.out.print("Who is the owner of the phone?: ");
        usersPhone.setOwner(scanner.nextLine());


        System.out.println(usersPhone.getModel());
        System.out.println(usersPhone.getOwner());
        System.out.println(usersPhone.getSerialNumber());
        System.out.println(usersPhone.getCarrier());
        System.out.println(usersPhone.getPhoneNumber());
    }

}
