package Liste;

import java.util.HashMap;

//4.Vrem sa creem un map pe baza lunilor din an, specificand numarul de zile din fiecare luna.
//
//e.g. {"iulie": 31}
//
//- creeaza mapul luand datele din 2 liste, una de stringuri care contine numele luniilor si alta de numere intregi, care contine numarul de zile. (daca nu stiti sa faceti asa, definiti manual mapul)
//
//- returneaza numarul de zile pt iunie, septembrie si decembrie
//
//- verifica daca mapul contine valoarea 28
//
//- verifica daca mapul contine cheia: "iulie"
//
//- calculeaza cate chei exista in map
//
//- printeaza toate cheile, toate valorile si mapul intreg
//
//- calculeaza numarul total de zile din toate lunile
//
//- calculeaza numarul total de zile din lunile mai, iunie si noiembrie.
public class Problema4 {
    public static void main(String[] args) {
        HashMap<String, Integer> calendar = new HashMap<String, Integer>();
        calendar.put("Ianuarie", 31);
        calendar.put("Februarie", 28);
        calendar.put("Martie", 31);
        calendar.put("Aprilie", 30);
        calendar.put("Mai", 31);
        calendar.put("Iunie", 30);
        calendar.put("Iulie", 31);
        calendar.put("August", 31);
        calendar.put("Septembrie", 30);
        calendar.put("Octombrie", 31);
        calendar.put("Noiembrie", 30);
        calendar.put("Decembrie", 31);
        System.out.println(calendar.get("Iunie") + " " + calendar.get("Septembrie") + " " + calendar.get("Decembrie"));
        System.out.println(calendar.containsValue(28));
        System.out.println(calendar.containsKey("Iulie"));
        for (String zi : calendar.keySet()) {
            System.out.println(zi);
        }
        for (Integer numere : calendar.values()) {
            System.out.println(numere);
        }
        System.out.println(calendar);

        System.out.println(calendar.size());

        int suma = 0;
        for (Integer zile:calendar.values()){
            suma= suma+zile;
        }
        System.out.println(suma);

        System.out.println(calendar.get("Iunie") + calendar.get("Mai") + calendar.get("Noiembrie"));
    }
}
