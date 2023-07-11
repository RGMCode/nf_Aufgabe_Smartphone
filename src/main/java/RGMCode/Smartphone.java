package RGMCode;

import java.util.ArrayList;
import java.util.Arrays;

public class Smartphone extends Contact implements Radio, GPS {

    private String model;

    private String hersteller;

    Contact[] contacts ={};

    public Smartphone(String model, String hersteller, Contact[] contacts) {
        this.model = model;
        this.hersteller = hersteller;
        this.contacts = contacts;
    }

    public Smartphone(String name, String model, String hersteller, Contact[] contacts) {
        super(name);
        this.model = model;
        this.hersteller = hersteller;
        this.contacts = contacts;
    }

    public boolean startRadio(){
        System.out.println("Radio started");
        return true;
    }

    public boolean stopRadio(){
        System.out.println("Radio stopped");
        return false;
    }

    @Override
    public String getPosition() {
        System.out.println("Kölle");
        return "Köln";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    public Contact[] getContacts() {
        return contacts;
    }

    public void setContacts(Contact[] contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Smartphone{" +
                "model='" + model + '\'' +
                ", hersteller='" + hersteller + '\'' +
                ", contacts=" + Arrays.toString(contacts) +
                "} " + super.toString();
    }
}
