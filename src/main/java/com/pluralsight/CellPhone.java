package com.pluralsight;

public class CellPhone {

    public int serialNumber;
    public String model;
    public String carrier;
    public String phoneNumber;
    public String owner;
    String RED = "\u001B[31m";
    String RESET = "\u001B[0m";

    public CellPhone() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    public void setSerialNumber(int serialNumber){
        this.serialNumber = serialNumber;
    }

    public void setModel(String model){
            this.model = model;
    }

    public void setCarrier(String carrier){
        this.carrier = carrier;
    }

    public void setPhoneNumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public String getModel(){
        return model;
    }

    public String getCarrier() {
        return carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void dial(String phoneNumber){
        System.out.println(getOwner() + "'s phone is calling " + RED +  phoneNumber + RESET);
    }
}
