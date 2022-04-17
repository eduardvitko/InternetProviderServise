package com.dto;

import com.model.Tariff;

import java.time.LocalDateTime;
import java.util.List;

public class SubscriptionDto {
    private int id;
    private String name;
    private List<TariffDto> tariffsDto;
    private int days;
    private boolean isActive;
    private LocalDateTime created;
    private LocalDateTime updated;

    public SubscriptionDto() {
    }

    public SubscriptionDto(String name, List<TariffDto> tariffsDto, int days, boolean isActive, LocalDateTime created, LocalDateTime updated) {
        this.name = name;
        this.tariffsDto = tariffsDto;
        this.days = days;
        this.isActive = isActive;
        this.created = created;
        this.updated = updated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TariffDto> getTariffsDto() {
        return tariffsDto;
    }

    public void setTariffsDto(List<TariffDto> tariffsDto) {
        this.tariffsDto = tariffsDto;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
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
