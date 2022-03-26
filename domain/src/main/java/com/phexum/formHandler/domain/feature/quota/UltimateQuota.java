package com.phexum.formHandler.domain.feature.quota;

public class UltimateQuota implements Quota{
    @Override
    public void quota() {
        System.out.println("Ultimate Quota");
    }
}
