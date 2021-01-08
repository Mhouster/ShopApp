package ConsolePrinting;

import IO.File.CSVtoMap;

public class EmployeeListPrinting {

    public void printEmployeeList() {
        CSVtoMap ctm = new CSVtoMap();
        System.out.println(ctm.createEmployeeMapFromCsvFile().values());
    }
}
