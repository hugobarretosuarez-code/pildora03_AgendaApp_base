package org.ulpgc.is1.model;

public abstract class Contact {
    public String telephone;
    public String email;

    public Contact(String telephone, String email) {
        this.telephone = telephone;
        this.email = email;
    }

    public void setAddress(String street, int number, int floor,
                           String city) {
        this.address = new Address(street, number, floor, city);
    }

    public abstract String getName();
}