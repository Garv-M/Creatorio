package com.example.hack;

public class details {

    String name_id;
    String name;
    String email;
    String password;

    public details(){}

    public details(String name_id, String name, String email, String phone) {
        this.name_id = name_id;
        this.name = name;
        this.email = email;
        this.password = phone;
    }

    public String getName_id() {
        return name_id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return password;
    }

}
