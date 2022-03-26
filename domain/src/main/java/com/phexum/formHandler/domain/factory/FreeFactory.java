package com.phexum.formHandler.domain.factory;

import com.phexum.formHandler.domain.feature.FormCount.FormCount;
import com.phexum.formHandler.domain.feature.FormCount.FreeFormCount;
import com.phexum.formHandler.domain.feature.autoReply.AutoReply;
import com.phexum.formHandler.domain.feature.autoReply.FreeAutoReply;
import com.phexum.formHandler.domain.feature.bill.Bill;
import com.phexum.formHandler.domain.feature.bill.FreeBill;
import com.phexum.formHandler.domain.feature.export.Export;
import com.phexum.formHandler.domain.feature.export.FreeExport;
import com.phexum.formHandler.domain.feature.instantAlert.FreeInstantAlert;
import com.phexum.formHandler.domain.feature.instantAlert.InstantAlert;
import com.phexum.formHandler.domain.feature.quota.FreeQuota;
import com.phexum.formHandler.domain.feature.quota.Quota;
import com.phexum.formHandler.domain.feature.report.FreeReport;
import com.phexum.formHandler.domain.feature.report.Report;
import com.phexum.formHandler.domain.feature.spam.FreeSpam;
import com.phexum.formHandler.domain.feature.spam.Spam;

public class FreeFactory implements FeatureFactory{
    @Override
    public Spam getSpam() {
        return new FreeSpam();
    }

    @Override
    public Report getReport() {
        return new FreeReport();
    }

    @Override
    public AutoReply getReply() {
        return new FreeAutoReply();
    }

    @Override
    public Quota getQuota() {
        return new FreeQuota();
    }

    @Override
    public FormCount getFormCount() {
        return new FreeFormCount();
    }

    @Override
    public Export getExport() {
        return new FreeExport();
    }

    @Override
    public InstantAlert getInstantAlert() {
      return new FreeInstantAlert();
    }

    @Override
    public Bill getBill() {
        return new FreeBill();
    }
}
