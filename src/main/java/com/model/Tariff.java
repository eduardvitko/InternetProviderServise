package com.model;

import java.util.List;

public class Tariff {
    private int id;
    private String name;
    private ServiceType type;
    private List<Limit> limitsList;
    private int pricePerDay;

}
