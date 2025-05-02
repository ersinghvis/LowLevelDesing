package designpatterns.strategypattern.exportdata.ReportFormatter;

public class FormatHTML extends FormatReport{

    @Override
    public String process(String data) {
        return data + ".html";
    }

}
