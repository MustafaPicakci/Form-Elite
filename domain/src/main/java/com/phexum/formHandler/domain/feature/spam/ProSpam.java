package com.phexum.formHandler.domain.feature.spam;

public class ProSpam implements Spam{
    @Override
    public void detectSpam() {
        System.out.println("pro spam detector çalıştı");
    }
}
