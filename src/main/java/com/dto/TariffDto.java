package com.dto;

import com.model.Limit;
import com.model.ServiceType;

import java.time.LocalDateTime;
import java.util.List;

public class TariffDto {
    private int id;
    private String name;
    private ServiceType type;
    private List<LimitDto> limitsListDto;
    private int pricePerDay;
    private boolean isActive;
    private LocalDateTime created;
    private LocalDateTime updated;

    public TariffDto() {
    }

    public TariffDto(String name, ServiceType type, List<LimitDto> limitsListDto, int pricePerDay, boolean isActive, LocalDateTime created, LocalDateTime updated) {
        this.name = name;
        this.type = type;
        this.limitsListDto = limitsListDto;
        this.pricePerDay = pricePerDay;
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

    public ServiceType getType() {
        return type;
    }

    public void setType(ServiceType type) {
        this.type = type;
    }

    public List<LimitDto> getLimitsListDto() {
        return limitsListDto;
    }

    public void setLimitsListDto(List<LimitDto> limitsListDto) {
        this.limitsListDto = limitsListDto;
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
