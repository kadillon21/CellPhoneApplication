package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CellPhone cellPhone1 = new CellPhone();
        CellPhone cellPhone2 = new CellPhone();
        CellPhone workPhone = new CellPhone(39488540, "iPhone 17", "T Mobile", "(773) 543-9485", "Year Up");

        addPhone(scanner, cellPhone1);
        addPhone(scanner, cellPhone2);
        display(cellPhone1);
        display(cellPhone2);
        display(workPhone);
        cellPhone1.dial(cellPhone2.getPhoneNumber());
        cellPhone2.dial(cellPhone1.getPhoneNumber());
        workPhone.dial(cellPhone2);

    }

    public static void addPhone(Scanner scanner, CellPhone usersPhone){

        System.out.print("What is the serial number?: ");
        usersPhone.setSerialNumber(scanner.nextInt());
        scanner.nextLine();
        System.out.print("What model is the phone?: ");
        usersPhone.setModel(scanner.nextLine().trim());
        System.out.print("Who is the carrier?: ");
        usersPhone.setCarrier(scanner.nextLine().trim());
        System.out.print("What is the phone number?: ");
        String phoneNumber = scanner.nextLine().trim();
        numberFormatter(phoneNumber, usersPhone, scanner);
        System.out.print("Who is the owner of the phone?: ");
        usersPhone.setOwner(scanner.nextLine().trim());

        System.out.println();

    }

    public static void display(CellPhone userPhone){


        System.out.println("Serial Number: " + ConsoleUtilities.RED + userPhone.getSerialNumber() + ConsoleUtilities.RESET);
        System.out.println("Model: " + ConsoleUtilities.RED + userPhone.getModel() + ConsoleUtilities.RESET);
        System.out.println("Carrier: " + ConsoleUtilities.RED + userPhone.getCarrier() + ConsoleUtilities.RESET);
        System.out.println("Phone Number: " + ConsoleUtilities.RED + userPhone.getPhoneNumber() + ConsoleUtilities.RESET);
        System.out.println("Owner: " + ConsoleUtilities.RED + userPhone.getOwner() + ConsoleUtilities.RESET);
        System.out.println();

    }

    public static void numberFormatter(String phoneNumber, CellPhone usersPhone, Scanner scanner){

        while (phoneNumber.length() != 10){
            System.out.print("Invalid phone number please try again (must be 10 digits ex. 3128456543): ");
            phoneNumber = scanner.nextLine();
        }

        String formatNumber = "(" + phoneNumber.substring(0, 3) + ") " + phoneNumber.substring(3, 6) + "-" + phoneNumber.substring(6, 10);
        usersPhone.setPhoneNumber(formatNumber);


    }

}
