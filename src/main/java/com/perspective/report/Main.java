package com.perspective.report;

import com.perspective.report.management.ReportExecutor;
import com.perspective.report.management.custom.Type01Report;
import com.perspective.report.management.custom.Type02Report;

public class Main {

    public static void main(String[] args) throws Exception {

        ReportExecutor for01TypeReport = new ReportExecutor(1);
        ReportExecutor for02TypeReport = new ReportExecutor(2);

        //Эти никогда параллельно не будут выполнятся
        for01TypeReport.execute(new Type01Report());
        for01TypeReport.execute(new Type01Report());

        //Два параллельно выполнятся, третий после того как один из первых двух закончит, потомучто Семафор на 2
        for02TypeReport.execute(new Type02Report());
        for02TypeReport.execute(new Type02Report());
        for02TypeReport.execute(new Type02Report());

    }

}
