package com.company.dto;

public class ReportDto {

    private String name;
    private BuyingDto[] data;
    private double totalSum;
    private int totalCount;


    public ReportDto(String name, BuyingDto[] data, double totalSum, int totalCount) {
        this.name = name;
        this.data = data;
        this.totalSum = totalSum;
        this.totalCount = totalCount;
    }

    public String getName() {
        return name;
    }

    public BuyingDto[] getData() {
        return data;
    }

    public double getTotalSum() {
        return totalSum;
    }

    public int getTotalCount() {
        return totalCount;
    }
}
