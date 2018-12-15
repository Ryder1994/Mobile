package com.example.marc.carpricem.User;

public class User {
    private String Name;
    private String firstName;
    private String mailAdress;
    private String country;
    private String town;
    private String street;
    private String number;
    private int postCode;
    private String phoneNumber;
    private String password;

    public User(String name, String firstName, String mailAdress, String country, String town, String street, String number, int postCode, String phoneNumber, String password) {
        Name = name;
        this.firstName = firstName;
        this.mailAdress = mailAdress;
        this.country = country;
        this.town = town;
        this.street = street;
        this.number = number;
        this.postCode = postCode;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getName() {
        return Name;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMailAdress() {
        return mailAdress;
    }

    public String getCountry() {
        return country;
    }

    public String getTown() {
        return town;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public int getPostCode() {
        return postCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }
}
