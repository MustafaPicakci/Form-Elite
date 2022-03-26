package com.phexum.formHandler.domain.feature.quota;

public class FreeQuota implements Quota{
    @Override
    public void quota() {
        System.out.println("Free Quota");
    }
}
