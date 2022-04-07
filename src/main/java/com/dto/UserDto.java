package com.dto;

import com.model.Role;

import java.time.LocalDateTime;

public class UserDto {
    private int id;
    private String phone;
    private String password;
    private boolean isActive;
    private Role role;
    private LocalDateTime created;
    private LocalDateTime updated;
}
