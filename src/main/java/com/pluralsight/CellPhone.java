package com.pluralsight;

import java.awt.*;

public class CellPhone {

    private int serialNumber;
    private String model;
    private String carrier;
    private String phoneNumber;
    private String owner;

    public CellPhone() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner){

        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;

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
        System.out.println(getOwner() + "'s phone is calling " + ColorUtilities.RED +  phoneNumber + ColorUtilities.RESET);
    }

    public void dial(CellPhone phone){
        System.out.println(getOwner() + "'s phone is calling " + ColorUtilities.RED +  phone.phoneNumber + ColorUtilities.RESET);
    }
}
