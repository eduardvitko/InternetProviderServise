package com.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;


public class User  {
    private int id;
    private String phone;
    private String password;
    private boolean isActive;
    private Role role;
    private LocalDateTime created;
    private LocalDateTime updated;

    public User() {
    }

    public User(String phone, String password) {
        this.phone = phone;
        this.password = password;
    }

    public Timestamp convertToTimestamp(LocalDateTime date){
        if(date == null) date = LocalDateTime.now();
        return Timestamp.valueOf(date);
    }


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

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "User{" +
                "id" + ":" + id +", "+
                "phone" +":"+ phone+", "+
                "password" +":" + password +", "+
                "isActive" + ":" +isActive +", "+
                "role" + ":" +role +", "+
                "created" + ":" + created +", "+
                "updated" + ":" + updated+"}";
    }
}
