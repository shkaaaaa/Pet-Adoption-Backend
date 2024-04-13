package com.anushka.petAdoption.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Users {

    @Id
    private String username;
    private String name;
    private String email;
    private String contact;
    private String password;

    public Users(String username, String name, String email, String contact, String password) {
        this.username = username;
        this.name = name;
        this.email = email;
        this.contact = contact;
        this.password = password;
    }

    public Users() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
