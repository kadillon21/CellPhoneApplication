package com.pluralsight;

public class CellPhone {

    public int serialNumber;
    public String model;
    public String carrier;
    public String phoneNumber;
    public String owner;

    public CellPhone(int serialNumber, String model, String carrier, String phoneNumber, String owner){

        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;

    }

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

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public void setOwner(String owner){
        this.owner = owner;
    }
}
