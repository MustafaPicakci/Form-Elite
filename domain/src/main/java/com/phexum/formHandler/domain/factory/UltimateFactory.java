package com.phexum.formHandler.domain.factory;

import com.phexum.formHandler.domain.feature.FormCount.FormCount;
import com.phexum.formHandler.domain.feature.FormCount.UltimateFormCount;
import com.phexum.formHandler.domain.feature.autoReply.AutoReply;
import com.phexum.formHandler.domain.feature.autoReply.UltimateAutoReply;
import com.phexum.formHandler.domain.feature.bill.Bill;
import com.phexum.formHandler.domain.feature.bill.FreeBill;
import com.phexum.formHandler.domain.feature.bill.UltimateBill;
import com.phexum.formHandler.domain.feature.export.Export;
import com.phexum.formHandler.domain.feature.export.UltimateExport;
import com.phexum.formHandler.domain.feature.instantAlert.InstantAlert;
import com.phexum.formHandler.domain.feature.instantAlert.UltimateInstantAlert;
import com.phexum.formHandler.domain.feature.quota.Quota;
import com.phexum.formHandler.domain.feature.quota.UltimateQuota;
import com.phexum.formHandler.domain.feature.report.Report;
import com.phexum.formHandler.domain.feature.report.UltimateReport;
import com.phexum.formHandler.domain.feature.spam.Spam;
import com.phexum.formHandler.domain.feature.spam.UltimateSpam;

public class UltimateFactory implements FeatureFactory {
    @Override
    public Spam getSpam() {
        return new UltimateSpam();
    }

    @Override
    public Report getReport() {
        return new UltimateReport();
    }

    @Override
    public AutoReply getReply() {
        return new UltimateAutoReply();
    }

    @Override
    public Quota getQuota() {
        return new UltimateQuota();
    }

    @Override
    public FormCount getFormCount() {
        return new UltimateFormCount();
    }

    @Override
    public Export getExport() {
        return new UltimateExport();
    }

    @Override
    public InstantAlert getInstantAlert() {
        return new UltimateInstantAlert();
    }

    @Override
    public Bill getBill() {
        return new UltimateBill();
    }
}
