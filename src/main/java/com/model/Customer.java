package com.model;


import java.time.LocalDateTime;
import java.util.List;

public class Customer {
    private int id;
    private String name;
    private String surname;
    private String phone_number;
    private String email;
    private List<Subscription> services;
    private Wallet wallet;
    private boolean isActive;
    private LocalDateTime created;
    private LocalDateTime updated;

    public Customer() {

    }

    public Customer(int id, String name, String surname, String phone_number, String email, List<Subscription> services, Wallet wallet, boolean isActive, LocalDateTime created, LocalDateTime updated) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
        this.email = email;
        this.services = services;
        this.wallet = wallet;
        this.isActive = isActive;
        this.created = created;
        this.updated = updated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Subscription> getServices() {
        return services;
    }

    public void setServices(List<Subscription> services) {
        this.services = services;
    }

    public Wallet getWallet() {
        return wallet;
    }

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        this.created = created;
    }

    public LocalDateTime getUpdated() {
        return updated;
    }

    public void setUpdated(LocalDateTime updated) {
        this.updated = updated;
    }
}
