package com.phexum.formHandler.domain.factory;

import com.phexum.formHandler.domain.account.model.AccountType;
import com.phexum.formHandler.domain.feature.FormCount.FormCount;
import com.phexum.formHandler.domain.feature.autoReply.AutoReply;
import com.phexum.formHandler.domain.feature.bill.Bill;
import com.phexum.formHandler.domain.feature.export.Export;
import com.phexum.formHandler.domain.feature.instantAlert.InstantAlert;
import com.phexum.formHandler.domain.feature.quota.Quota;
import com.phexum.formHandler.domain.feature.report.Report;
import com.phexum.formHandler.domain.feature.spam.Spam;

import java.util.HashMap;
import java.util.Map;

public final class FactoryUtil {
    private static final Map<AccountType, FeatureFactory> factoryMap = new HashMap<>();
    private static final FeatureFactory freeFactory = new FreeFactory();
    private static final FeatureFactory proFactory = new ProFactory();
    private static final FeatureFactory ultimateFactory = new UltimateFactory();

    private FactoryUtil() {
    }

    static {
        factoryMap.put(AccountType.FREE, freeFactory);
        factoryMap.put(AccountType.PRO, proFactory);
        factoryMap.put(AccountType.ULTIMATE, ultimateFactory);
    }

    public static FeatureFactory getFactory(AccountType type) {
        return factoryMap.getOrDefault(type, freeFactory);
    }

}

