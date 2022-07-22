package com.company.view;

import com.company.dto.BuyingDto;
import com.company.dto.ReportDto;

public class ReportView {

    public static final String DESCRIPTION = "\t\t\tREPORT DATA: ";

    public void printDetails(ReportDto report) {
        System.out.println("\n");
        int dash = 53;
        System.out.println(DESCRIPTION + report.getName());
        System.out.println("=".repeat(dash));

        System.out.printf("%-20s %-20s %s", "Name", "Count", "Sum");
        System.out.println("".repeat(dash));
        for (BuyingDto buyingDto : report.getData()) {
            String cost = Math.round(buyingDto.getSum()) + " uah";
            System.out.println("-".repeat(dash));
            System.out.printf("%-20s %-20s %s", buyingDto.getName(), buyingDto.getCount(), cost);

            System.out.println("".repeat(dash));
        }
        System.out.println("=".repeat(dash));
        System.out.printf("%-20s %-20s %s", "Total products:", report.getTotalCount() + " units",
                report.getTotalSum() + " uah" + "\n");

    }
}




