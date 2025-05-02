package designpatterns.strategypattern.exportdata.decoartors;

import designpatterns.strategypattern.exportdata.ReportFormatter.FormatReport;

public abstract class DecorateFormatData extends FormatReport {

    public abstract String process(String data);

}
