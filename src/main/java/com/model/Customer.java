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

}
