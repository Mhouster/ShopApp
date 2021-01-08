package Modules;

import IO.File.CSVtoMap;
import Model.Employee;

public class SearchOrDeleteEmployee {
        CSVtoMap ctm = new CSVtoMap();

    public Employee searchForEmployee(int key) {
        return ctm.createEmployeeMapFromCsvFile().get(key);
    }

    public void deleteEmployee(int key) {
        ctm.createEmployeeMapFromCsvFile().remove(key);
    }
}
