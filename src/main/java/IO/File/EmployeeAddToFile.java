package IO.File;


import Model.Employee;

import java.io.File;

public class EmployeeAddToFile {
    AddingToFile addingToFile = new AddingToFile();

    public void addEmployeeToFile(Employee employee) {
        addingToFile.addToFile(employee, new File("EmployeeList.csv"));
    }
}




