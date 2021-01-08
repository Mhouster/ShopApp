package IO.File;

import Model.Employee;

import java.io.*;

public class AddingToFile {
//    String fileName = "EmployeeList.csv";
//    String fileName1 = "Product.csv";
    public <T1> void addToFile(T1 employee, File fileName) {
        try (
                var writer = new BufferedWriter(new FileWriter(fileName, true));
                var fileReader =new FileReader(fileName);
        ){
            writer.newLine();
            writer.write(String.valueOf(employee));
        } catch(IOException e){
            System.err.println("Cannot save file " + fileName);
        }
    }
}
