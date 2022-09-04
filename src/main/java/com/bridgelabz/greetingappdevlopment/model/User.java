package com.bridgelabz.greetingappdevlopment.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String fName;
    private String lName;

    public User() {

    }

    public User(String fName, String lName) {
        super();
        this.fName = fName;
        this.lName = lName;
    }

    public User(User user) {
        this.id=user.id;
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
