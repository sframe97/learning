package OOP.tema3;
//2. Am o clasa Person (name, address, email), clasa Employee(employeeNumber,salary) care mosteneste clasa Person si clasele Profesor (courses - Lista, experience) si Secretary(schedule - Map) care mostenesc Employee. Stim ca un profesor cu experienta >15 ani are un bonus de 10% din salar iar unul cu experienta mai mare de 20 ani are un bonus de 15% din salar. Stim ca un secretar are 75% din salariul unui profesor.
//
//Implementeaza solutia si detaliaza continutul:
//
//Profesorul Ionescu Cristian, avand adresa: str Zorilor, nr 7, Cluj Napoca, email: ionescu@gmail.com avand o experienta de 15 ani, si tinand urmatoarele cursuri: Testare, JS, Java are un salar de 1000 ron.
public class Person {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    String name;
    String address;
    String email;
}
