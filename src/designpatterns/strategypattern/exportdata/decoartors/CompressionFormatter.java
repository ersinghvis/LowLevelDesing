package designpatterns.strategypattern.exportdata.decoartors;

import designpatterns.strategypattern.exportdata.ReportFormatter.FormatReport;

public class CompressionFormatter extends DecorateFormatData{

    private FormatReport formatReport;

    public CompressionFormatter(FormatReport formatReport){
        this.formatReport = formatReport;
    }
    @Override
    public String process(String data) {
        return formatReport.process(data) + "..H4sIAAAAAAA...";
    }

}
