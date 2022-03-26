package com.phexum.formHandler.domain;

import com.phexum.formHandler.domain.account.model.AccountType;
import com.phexum.formHandler.domain.factory.FactoryUtil;
import com.phexum.formHandler.domain.factory.FeatureFactory;
import com.phexum.formHandler.domain.factory.FeatureFunction;

public class main {
    public static void main(String[] args) {
        FeatureFunction.getQuota(AccountType.ULTIMATE).quota();
    }
}
