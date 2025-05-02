package designpatterns.strategypattern.exportdata;

import designpatterns.strategypattern.exportdata.ReportFormatter.DecoratorType;
import designpatterns.strategypattern.exportdata.ReportFormatter.FormatReport;
import designpatterns.strategypattern.exportdata.decoartors.EncryptedDecorator;
import designpatterns.strategypattern.exportdata.factory.DecoratorFactory;
import designpatterns.strategypattern.exportdata.factory.ExportDataFactory;

import java.util.List;

public class ExportData {

    public String exportData(String data, ExportType type, List<DecoratorType> decoratorTypeList){

        FormatReport report = ExportDataFactory.getFormatReport(type);
        String result = "";
        if( report != null ){
            for (DecoratorType decoratorType : decoratorTypeList){
                if( report instanceof EncryptedDecorator){
                    System.out.println("No more operations allowed");
                    break;
                }
                report = DecoratorFactory.getDecorator(decoratorType,report);
            }
            result = report.process("data");
        }else{
            System.out.println("No suitable report formatter found");
        }
        return result;
    }

}
