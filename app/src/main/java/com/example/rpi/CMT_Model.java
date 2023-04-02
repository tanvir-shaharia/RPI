package com.example.rpi;

public class CMT_Model {
    String name,title,profile,email,phone;

    public CMT_Model(String name, String title, String profile, String email, String phone) {
        this.name = name;
        this.title = title;
        this.profile = profile;
        this.email = email;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public String getProfile() {
        return profile;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

}
