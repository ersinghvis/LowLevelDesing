import designpatterns.strategypattern.exportdata.ExportData;
import designpatterns.strategypattern.exportdata.ExportType;
import designpatterns.strategypattern.exportdata.ReportFormatter.DecoratorType;

import java.util.Arrays;

class Main {

    public static void main(String[] args) {
        ExportData exportData = new ExportData();
        String res = exportData.exportData("aghv", ExportType.PDF,
                Arrays.asList(DecoratorType.COMPRESSED,DecoratorType.WATERMARK,
                        DecoratorType.COMPRESSED,DecoratorType.ENCRYPTED, DecoratorType.WATERMARK));
        System.out.println("Data transformation done");
        System.out.println("Data :- " + res);
    }
}