package OOP.curs3;

import OOP.tema3.Profesor;
import OOP.tema3.Secretary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Mainn {
    public static void main(String[] args) {
        List<String> cursuri = new ArrayList<String>();
        cursuri.add("Testare");
        cursuri.add("JAVA");
        cursuri.add("JS");
        Profesor profesor = new Profesor(1000, 2, 15, cursuri);

        HashMap<String, Integer> schedule = new HashMap<>();
        schedule.put("meeting", 8);
        schedule.put("lunch", 12);
        schedule.put("retro", 14);
        Secretary secretar = new Secretary(profesor.getSalary(), 1, 17,schedule);
        profesor.setName("Ionescu Cristian");
        profesor.setAddress("str Zorilor, nr 7");
        profesor.setEmail("email: ionescu@gmail.com");
        System.out.println(secretar.getSalary());
        System.out.println(profesor.getSalary());
    }
}
