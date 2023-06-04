package OOP.tema;
//1.Creeaza o Clasa Employee care are: nume (String), position (String), yearsOfService
//(int).
//Creeaza urmatoarele metode: getName(),setName(),getPosition(),setPosition(), getYearsOfService, setYearsOfService(), getSalary().
//Daca employee-ul este "manager" va avea un salar de baza de 1000ron iar daca e "tester" va avea un salar de baza de 1200RON. Daca vechimea e mai mare de 10 ani, va primii un bonus de 10% la salar.
public class Problema1 {
    public static void main(String[] args) {
        Employee angajat = new Employee();
        angajat.setName("vasile");
        Employee angajat2 = new Employee();
        angajat2.setName("ionel");
        System.out.println(angajat.getName());
        System.out.println(angajat2.getName());

        angajat.setPosition("manager");
        angajat2.setPosition("tester");
        angajat2.setSalary();
        angajat.setSalary();
        System.out.println(angajat.getSalary());
        System.out.println(angajat2.getSalary());
        angajat.setYearsOfService(12);
        angajat2.setYearsOfService(4);
        System.out.println(angajat.getSalary());
        System.out.println(angajat2.getSalary());
    }
}
