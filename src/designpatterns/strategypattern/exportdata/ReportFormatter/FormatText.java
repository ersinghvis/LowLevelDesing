package designpatterns.strategypattern.exportdata.ReportFormatter;

public class FormatText extends FormatReport{
    @Override
    public String process(String data) {
        return data + ".txt";
    }
}
