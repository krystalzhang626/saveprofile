package com.example.zhangyuying.saveprofile;

public class user {
    private String name;
    private  String email;

    public user(){

    }

    public user(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
