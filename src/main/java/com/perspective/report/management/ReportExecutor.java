package com.perspective.report.management;

import java.util.concurrent.Semaphore;

public class ReportExecutor {

    private final Semaphore sem;

    public ReportExecutor(int parallel) {
        this.sem = new Semaphore(parallel);
    }

    public void execute(Report report) {
        Thread t = new Thread(() -> {
            try {
                sem.acquire();
                report.generate();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                sem.release();
            }
        });
        t.start();
    }

}
