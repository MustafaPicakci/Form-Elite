package com.phexum.formHandler.domain.feature.report;

public class FreeReport implements Report{
    @Override
    public void createReport() {
        System.out.println("Free Report");
    }
}
