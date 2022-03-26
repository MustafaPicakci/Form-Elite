package com.phexum.formHandler.domain.feature.quota;

public class ProQuota implements Quota{
    @Override
    public void quota() {
        System.out.println("Pro Quota");
    }
}
