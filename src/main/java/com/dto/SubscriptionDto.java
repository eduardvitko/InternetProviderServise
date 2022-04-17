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
}
