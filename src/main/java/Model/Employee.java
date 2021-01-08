package Model;

import java.io.Serializable;
import java.util.Objects;

public class Employee implements Serializable {
    private String name;
    private String secondName;
    private int age;
    private long pesel;
    private int practice;

    public Employee(String name, String secondName, int age, long pesel, int practice) {
        this.name = Objects.requireNonNull(name, "Please write the name");
        this.secondName = Objects.requireNonNull(secondName, "Please write a second name");
        this.age = age;
        this.pesel = pesel;
        this.practice = practice;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPesel() {
        return pesel;
    }

    public void setPesel(long pesel) {
        this.pesel = pesel;
    }

    public int getPractice() {
        return practice;
    }

    public void setPractice(int practice) {
        this.practice = practice;
    }


    @Override
    public String toString() {
        return name + "," + secondName + "," + age + "," + pesel + "," + practice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && pesel == employee.pesel && practice == employee.practice && Objects.equals(name, employee.name) && Objects.equals(secondName, employee.secondName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, secondName, age, pesel, practice);
    }
}
