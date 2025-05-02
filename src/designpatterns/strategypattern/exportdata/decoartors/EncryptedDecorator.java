package designpatterns.strategypattern.exportdata.decoartors;

import designpatterns.strategypattern.exportdata.ReportFormatter.FormatReport;

public class EncryptedDecorator extends DecorateFormatData{

    private FormatReport formatReport;

    public EncryptedDecorator(FormatReport formatReport){
        this.formatReport = formatReport;
    }
    @Override
    public String process(String data) {
        return formatReport.process(data) + "..gP93Wm89AvGk3eY3rG==";
    }

}
