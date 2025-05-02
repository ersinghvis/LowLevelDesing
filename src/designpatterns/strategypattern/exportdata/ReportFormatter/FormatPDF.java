package designpatterns.strategypattern.exportdata.ReportFormatter;

public class FormatPDF extends FormatReport{

    @Override
    public String process(String data) {
        return data + ".pdf";
    }

}
