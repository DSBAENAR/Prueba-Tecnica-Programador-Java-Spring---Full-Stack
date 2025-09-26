package com.programmedemails.appcore.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contact")
public class Contact {
    private String firstname;
    private String email;
    private String gender;
    private String direction;
    private String lastname;

    
    public Contact(String firstname, String lastname , String email, String gender, String direction) {
        this.firstname = firstname;
        this.email = email;
        this.gender = gender;
        this.direction = direction;
    }

    public Contact(){}

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    

    
    
}
