package IO.File;

import Model.Employee;
import Model.Product;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;

import java.io.*;
import java.util.*;

public class CSVtoMap {

    CsvMapper csvMapper = new CsvMapper();
    CsvSchema schema = CsvSchema.emptySchema().withHeader();
    ObjectReader oReader = csvMapper.reader(Employee.class).with(schema);
    Map<Integer, Employee> EmployeeMap = new HashMap<>();
    ObjectReader oReader1 = csvMapper.reader(Product.class).with(schema);
    Map<Integer, Product> ProductMap = new HashMap<>();

    public Map<Integer, Employee> createEmployeeMapFromCsvFile() {
        try {
            Reader reader = new FileReader("EmployeeList.csv");
            MappingIterator<Employee> mi = oReader.readValues(reader);
            int value = 0;
            while (mi.hasNext()) {
                Employee current = mi.next();
                EmployeeMap.put(value, current);
                value++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return EmployeeMap;
    }

    public Map<Integer, Product> createProductMapFromCsvFile() {
        try {
            Reader reader = new FileReader("Product.csv");
            MappingIterator<Product> mi = oReader1.readValues(reader);
            int value = 0;
            while (mi.hasNext()) {
                Product current = mi.next();
                ProductMap.put(value, current);
                value++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ProductMap;
    }
}

