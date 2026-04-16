package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CellPhone usersPhone = new CellPhone();

        /*
         usersPhone.setSerialNumber(scanner.nextInt());
         usersPhone.setModel(scanner.nextLine());
         usersPhone.setCarrier(scanner.nextLine());
         usersPhone.setPhoneNumber(scanner.nextInt());
         usersPhone.setOwner(scanner.nextLine());
        */

        System.out.println("What is the serial number?: ");
        usersPhone.setSerialNumber();
        System.out.println("What model is the phone?: ");
        System.out.println("Who is the carrier?: ");
        System.out.println("What is the phone number?: ");
        System.out.println("Who is the owner of the phone?: ");

    }

}
