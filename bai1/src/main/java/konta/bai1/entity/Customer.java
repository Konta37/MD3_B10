package konta.bai1.entity;

import java.util.Date;

public class Customer {
    private String name;
    private String dateOfBirth;
    private String address;
    private String customerImage;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCustomerImage() {
        return customerImage;
    }

    public void setCustomerImage(String customerImage) {
        this.customerImage = customerImage;
    }

    public Customer() {
    }

    public Customer(String name, String dateOfBirth, String address, String customerImage) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.address = address;
        this.customerImage = customerImage;
    }


}
