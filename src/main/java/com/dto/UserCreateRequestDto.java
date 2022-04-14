package com.dto;

public class UserCreateRequestDto {
    private String phone;
    private String password;
    private  String condPassword;

    public UserCreateRequestDto(String phone, String password, String condPassword) {
        this.phone = phone;
        this.password = password;
        this.condPassword = condPassword;
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

    public String getCondPassword() {
        return condPassword;
    }

    public void setCondPassword(String condPassword) {
        this.condPassword = condPassword;
    }
}
