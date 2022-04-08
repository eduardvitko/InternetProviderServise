package com.model;

import java.sql.Date;
import java.time.LocalDate;


public class User {
    private int id;
    private String phone;
    private String password;
    private boolean isActive;
    private Role role;
    private LocalDate created;
    private LocalDate updated;

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

    public LocalDate getCreated() {
        return created;
    }

    public void setCreated() {
        this.created = created;
    }

    public LocalDate getUpdated() {
        return updated;
    }

    public void setUpdated() {
        this.updated = updated;
    }
}
