package OOP.tema3;

public class Employee extends Person{
    int employeeNumber;

    public double getSalary() {
        return salary;
    }

    double salary;

    int experienta;
    public Employee (double salary, int employeeNumber, int experienta){
        this.salary = salary;
        this.employeeNumber = employeeNumber;
        this.experienta = experienta;
    }
}
