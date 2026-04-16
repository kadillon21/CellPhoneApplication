package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        CellPhone usersPhone = new CellPhone();

        addPhoneNumber(scanner, usersPhone);
        phoneInformation(usersPhone);
    }

    public static void addPhoneNumber(Scanner scanner, CellPhone usersPhone){

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
        System.out.println();

    }

    public static void phoneInformation(CellPhone userPhone){

        String RED = "\u001B[31m";
        String RESET = "\u001B[0m";

        System.out.println("Serial Number: " + RED + userPhone.getSerialNumber() + RESET);
        System.out.println("Model: " + RED + userPhone.getModel() + RESET);
        System.out.println("Carrier: " + RED + userPhone.getCarrier() + RESET);
        System.out.println("Phone Number: " + RED + userPhone.getPhoneNumber() + RESET);
        System.out.println("Owner: " + RED + userPhone.getOwner() + RESET);


    }

}
