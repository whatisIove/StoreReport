package com.company.view;

import com.company.dto.BuyingTopFiveDto;
import com.company.dto.ReportTopFiveDto;
import com.company.service.ReportService;

public class ReportTopFiveView {

    public static final String DESCRIPTION = "\n\t\tREPORT DATA: " + ReportService.top + " top ";

    public void printDetails(ReportTopFiveDto report) {
        int dash = 53;
        System.out.println("=".repeat(dash));
        System.out.println(DESCRIPTION + report.getName());
        System.out.println("=".repeat(dash));

        System.out.printf("%-30s %-30s", "Name", "Count");
        System.out.println("".repeat(dash));
        for (BuyingTopFiveDto buyingTopFiveDto : report.getData()) {
            System.out.println("-".repeat(dash));
            System.out.printf("%-30s %-30s", buyingTopFiveDto.getName(), buyingTopFiveDto.getCount());
            System.out.println("".repeat(dash));
        }
    }
}
