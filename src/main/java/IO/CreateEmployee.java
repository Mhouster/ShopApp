package IO;

import Model.Employee;

import java.util.Scanner;

public class CreateEmployee {
        static final Scanner INPUT = new Scanner(System.in);
    public Employee creatingEmployee() {
        String name = INPUT.nextLine();
        String secondName = INPUT.nextLine();
        int age = INPUT.nextInt();
        long PESEL = INPUT.nextLong();
        int practice = INPUT.nextInt();
        return new Employee(name, secondName, age, PESEL, practice);
    }
}
