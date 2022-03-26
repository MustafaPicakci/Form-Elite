package com.phexum.formHandler.domain.factory;

import com.phexum.formHandler.domain.feature.FormCount.FormCount;
import com.phexum.formHandler.domain.feature.autoReply.AutoReply;
import com.phexum.formHandler.domain.feature.bill.Bill;
import com.phexum.formHandler.domain.feature.export.Export;
import com.phexum.formHandler.domain.feature.instantAlert.InstantAlert;
import com.phexum.formHandler.domain.feature.quota.Quota;
import com.phexum.formHandler.domain.feature.report.Report;
import com.phexum.formHandler.domain.feature.spam.Spam;

public interface FeatureFactory {
    Spam getSpam();
    Report getReport();
    AutoReply getReply();
    Quota getQuota();
    FormCount getFormCount();
    Export getExport();
    InstantAlert getInstantAlert();
    Bill getBill();
}
