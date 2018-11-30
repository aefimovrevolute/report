package com.perspective.report.management.type;

public enum ReportType {
    TYPE_1("Отчет 1-го вида"),
    TYPE_2("Отчет 2-го вида");

    private String description;

    ReportType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
