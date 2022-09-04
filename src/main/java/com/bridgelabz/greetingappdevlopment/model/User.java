package com.bridgelabz.greetingappdevlopment.model;

public class User {
    private String fName;
    private String lName;

    public User() {

    }
    public User(User user) {
        this.fName=user.fName;
        this.lName=user.lName;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }
}
