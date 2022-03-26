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

import static com.phexum.formHandler.domain.factory.FactoryUtil.getFactory;

public final class FeatureFunction {

    public static Spam getSpam(AccountType type) {
        return getFactory(type).getSpam();
    }

    public static Report getReport(AccountType type) {
        return getFactory(type).getReport();
    }

    public static AutoReply getReply(AccountType type) {
        return getFactory(type).getReply();
    }

    public static Quota getQuota(AccountType type) {
        return getFactory(type).getQuota();
    }

    public static FormCount getFormCount(AccountType type) {
        return getFactory(type).getFormCount();
    }

    public static Export getExport(AccountType type) {
        return getFactory(type).getExport();
    }

    public static InstantAlert getInstantAlert(AccountType type) {
        return getFactory(type).getInstantAlert();
    }

    public static Bill getBill(AccountType type) {
        return getFactory(type).getBill();
    }
}
