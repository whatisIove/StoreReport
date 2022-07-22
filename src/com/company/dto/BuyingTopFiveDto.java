package com.company.dto;

public class BuyingTopFiveDto {

    private String name;
    private int count;

    public BuyingTopFiveDto(String name, int count) {
        this.name = name;
        this.count = count;
    }

    public String getName() {
        return name;
    }

    public int getCount() {
        return count;
    }
}
