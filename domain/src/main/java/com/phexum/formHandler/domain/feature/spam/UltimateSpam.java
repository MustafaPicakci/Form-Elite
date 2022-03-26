package com.phexum.formHandler.domain.feature.spam;

public class UltimateSpam implements Spam{
    @Override
    public void detectSpam() {
        System.out.println("ultimate spam detector çalıştı");
    }
}
