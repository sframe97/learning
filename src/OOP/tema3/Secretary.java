package OOP.tema3;

import java.util.HashMap;

public class Secretary extends Employee {

    HashMap<String, Integer> schedule;
    public Secretary(double profesorSalary, int employeeNumber, int experienta, HashMap<String, Integer> schedule) {
        super(profesorSalary, employeeNumber, experienta);
        salary=0.75*profesorSalary;
    }
}
