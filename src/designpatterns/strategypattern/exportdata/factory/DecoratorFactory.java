package designpatterns.strategypattern.exportdata.factory;

import designpatterns.strategypattern.exportdata.ExportType;
import designpatterns.strategypattern.exportdata.ReportFormatter.*;
import designpatterns.strategypattern.exportdata.decoartors.CompressionFormatter;
import designpatterns.strategypattern.exportdata.decoartors.EncryptedDecorator;
import designpatterns.strategypattern.exportdata.decoartors.WatermarkDecorator;

public class DecoratorFactory {
    public static FormatReport getDecorator(DecoratorType type, FormatReport report){
        if( type == DecoratorType.WATERMARK ){
            return new WatermarkDecorator(report);
        }else if( type == DecoratorType.ENCRYPTED ){
            return new EncryptedDecorator(report);
        }else if( type == DecoratorType.COMPRESSED ){
            return new CompressionFormatter(report);
        }else{
            return null;
        }
    }

}
