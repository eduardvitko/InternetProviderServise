package com.dto;

import com.model.Role;

import java.time.LocalDateTime;

public class UserDto {
    public UserDto() {
    }

    public UserDto(String phone, String password, boolean isActive, Role role, LocalDateTime updated) {
        this.phone = phone;
        this.password = password;
        this.isActive = isActive;
        this.role = role;
        this.updated = updated;
    }

    private int id;
    private String phone;
    private String password;
    private boolean isActive;
    private Role role;
    private LocalDateTime created;
    private LocalDateTime updated;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
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
