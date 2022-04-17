package com.dto;

import com.model.Subscription;
import com.model.Wallet;

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
}
