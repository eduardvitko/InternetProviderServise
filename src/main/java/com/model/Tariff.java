package com.model;

import java.time.LocalDateTime;
import java.util.List;

public class Tariff {
    private int id;
    private String name;
    private ServiceType type;
    private List<Limit> limitsList;
    private int pricePerDay;
    private boolean isActive;
    private LocalDateTime created;
    private LocalDateTime updated;

}
