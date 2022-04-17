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
}
