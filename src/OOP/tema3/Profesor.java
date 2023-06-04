package OOP.tema3;

import java.util.List;

public class Profesor extends Employee{
    List<String> cursuri;
    public Profesor(double salary, int employeeNumber, int experienta, List<String> cursuri) {
        super(salary, employeeNumber, experienta);
        if (experienta>20){
            this.salary=salary+0.15*salary;
        } else
        if (experienta>15){
           this.salary=salary+0.10*salary;
        }
        this.cursuri=cursuri;
    }
}
