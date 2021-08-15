package com.example.hack;

public class uploadinfo {

    public String imageName;
    public String imageURL;
    private String address;
    private String price;
    private String phone;
    public uploadinfo(){}

    public uploadinfo(String imageName, String imageURL, String address, String price, String phone) {
        this.imageName = imageName;
        this.imageURL = imageURL;
        this.address = address;
        this.price = price;
        this.phone = phone;
    }

    public String getImageName() {
        return imageName;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getAddress() {
        return address;
    }

    public String getPrice() {
        return price;
    }

    public String getPhone() {
        return phone;
    }
}
