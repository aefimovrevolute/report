package com.perspective.report.management.custom;

import com.perspective.report.management.Report;
import com.perspective.report.management.type.ReportType;

import java.time.LocalDateTime;

public class Type01Report implements Report {

    private final ReportType reportType = ReportType.TYPE_1;

    public void generate() {
        try {
            System.out.println(String.format("Report [%s] started at: [%s]", reportType.getDescription(), LocalDateTime.now().toString()));
            System.out.println("Should wait 30 sec. for execution.");
            Thread.sleep(30000);
            System.out.println(String.format("Report [%s] finished at: [%s]", reportType.getDescription(), LocalDateTime.now().toString()));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
