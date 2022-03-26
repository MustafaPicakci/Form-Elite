package com.phexum.formHandler.domain.feature.bill;

public class FreeBill implements Bill{
    @Override
    public void createBill() {
        System.out.println("free bill");
    }
}
