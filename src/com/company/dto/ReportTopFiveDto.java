package com.company.dto;

public class ReportTopFiveDto {

    private String name;
    private BuyingTopFiveDto[] data;

    public ReportTopFiveDto(String name, BuyingTopFiveDto[] data) {
        this.name = name;
        this.data = data;
    }

    public String getName() {
        return name;
    }

    public BuyingTopFiveDto[] getData() {
        return data;
    }
}
