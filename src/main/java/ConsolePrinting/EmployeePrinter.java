package ConsolePrinting;

import Model.Employee;

public abstract class EmployeePrinter {

    public void printEmployeeData(Employee employee) {
        System.out.println("Name: " + employee.getName() + " | SecondName: " + employee.getSecondName() +
                " | Age: " + employee.getAge() + " | Pesel: " + employee.getPesel() + " | Practice: " +
                employee.getPractice() + " |");
    }

    public void customPrint() {
        System.out.println();
    }
}
