package designpatterns.strategypattern.exportdata.decoartors;

import designpatterns.strategypattern.exportdata.ReportFormatter.FormatReport;

public class WatermarkDecorator extends DecorateFormatData{

    private FormatReport formatReport;

    public WatermarkDecorator(FormatReport formatReport){
        this.formatReport = formatReport;
    }
    @Override
    public String process(String data) {
        return formatReport.process(data) + "--confidential--";
    }
}
