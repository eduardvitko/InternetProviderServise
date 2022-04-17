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

    public Tariff() {
    }

    public Tariff(int id, String name, ServiceType type, List<Limit> limitsList, int pricePerDay, boolean isActive, LocalDateTime created, LocalDateTime updated) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.limitsList = limitsList;
        this.pricePerDay = pricePerDay;
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

    public ServiceType getType() {
        return type;
    }

    public void setType(ServiceType type) {
        this.type = type;
    }

    public List<Limit> getLimitsList() {
        return limitsList;
    }

    public void setLimitsList(List<Limit> limitsList) {
        this.limitsList = limitsList;
    }

    public int getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(int pricePerDay) {
        this.pricePerDay = pricePerDay;
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
