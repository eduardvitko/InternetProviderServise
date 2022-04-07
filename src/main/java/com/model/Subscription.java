package com.model;

import java.time.LocalDateTime;
import java.util.List;

public class Subscription {
    private int id;
    private String name;
    private List<Tariff> tariffs;
    private int days;
    private boolean isActive;
    private LocalDateTime created;
    private LocalDateTime updated;

}
