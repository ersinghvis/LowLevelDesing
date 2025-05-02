package designpatterns.strategypattern.exportdata.factory;

import designpatterns.strategypattern.exportdata.ExportType;
import designpatterns.strategypattern.exportdata.ReportFormatter.FormatHTML;
import designpatterns.strategypattern.exportdata.ReportFormatter.FormatPDF;
import designpatterns.strategypattern.exportdata.ReportFormatter.FormatReport;
import designpatterns.strategypattern.exportdata.ReportFormatter.FormatText;

public class ExportDataFactory {

    public static FormatReport getFormatReport(ExportType type){
        if( type == ExportType.HTML ){
            return new FormatHTML();
        }else if( type == ExportType.PDF ){
            return new FormatPDF();
        }else if( type == ExportType.TEXT ){
            return new FormatText();
        }else{
            return null;
        }
    }

}
