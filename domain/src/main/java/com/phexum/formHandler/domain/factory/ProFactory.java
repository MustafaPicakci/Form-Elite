package com.phexum.formHandler.domain.factory;

import com.phexum.formHandler.domain.feature.FormCount.FormCount;
import com.phexum.formHandler.domain.feature.FormCount.ProFormCount;
import com.phexum.formHandler.domain.feature.autoReply.AutoReply;
import com.phexum.formHandler.domain.feature.autoReply.ProAutoReply;
import com.phexum.formHandler.domain.feature.bill.Bill;
import com.phexum.formHandler.domain.feature.bill.FreeBill;
import com.phexum.formHandler.domain.feature.bill.ProBill;
import com.phexum.formHandler.domain.feature.export.Export;
import com.phexum.formHandler.domain.feature.export.ProExport;
import com.phexum.formHandler.domain.feature.instantAlert.InstantAlert;
import com.phexum.formHandler.domain.feature.instantAlert.ProInstantAlert;
import com.phexum.formHandler.domain.feature.quota.ProQuota;
import com.phexum.formHandler.domain.feature.quota.Quota;
import com.phexum.formHandler.domain.feature.report.ProReport;
import com.phexum.formHandler.domain.feature.report.Report;
import com.phexum.formHandler.domain.feature.spam.ProSpam;
import com.phexum.formHandler.domain.feature.spam.Spam;

public class ProFactory implements FeatureFactory {
    @Override
    public Spam getSpam() {
        return new ProSpam();
    }

    @Override
    public Report getReport() {
        return new ProReport();
    }

    @Override
    public AutoReply getReply() {
        return new ProAutoReply();
    }

    @Override
    public Quota getQuota() {
        return new ProQuota();
    }

    @Override
    public FormCount getFormCount() {
        return new ProFormCount();
    }

    @Override
    public Export getExport() {
        return new ProExport();
    }

    @Override
    public InstantAlert getInstantAlert() {
        return new ProInstantAlert();
    }

    @Override
    public Bill getBill() {
        return new ProBill();
    }
}
