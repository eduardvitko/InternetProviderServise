package com.dto;

import java.time.LocalDateTime;
import java.util.List;

public class CustomerDto {
    private int id;
    private String name;
    private String surname;
    private String phone_number;
    private String email;
    private List<SubscriptionDto> servicesDto;
    private WalletDto walletDto;
    private boolean isActive;
    private LocalDateTime created;
    private LocalDateTime updated;

    public CustomerDto() {
    }

    public CustomerDto(String name, String surname, String phone_number, String email, List<SubscriptionDto> servicesDto, WalletDto walletDto, boolean isActive, LocalDateTime created, LocalDateTime updated) {
        this.name = name;
        this.surname = surname;
        this.phone_number = phone_number;
        this.email = email;
        this.servicesDto = servicesDto;
        this.walletDto = walletDto;
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

    public List<SubscriptionDto> getServicesDto() {
        return servicesDto;
    }

    public void setServicesDto(List<SubscriptionDto> servicesDto) {
        this.servicesDto = servicesDto;
    }

    public WalletDto getWalletDto() {
        return walletDto;
    }

    public void setWalletDto(WalletDto walletDto) {
        this.walletDto = walletDto;
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
