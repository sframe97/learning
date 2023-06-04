package Liste;

import java.util.ArrayList;
import java.util.List;

//1. Am o lista de stringuri. Inlocuieste in lista valorile stringurilor cu nr de vocale din string (daca e pe pozitie para) si cu nr de consoane (daca e pe pozitie impara)
//
//["apa","sare","suc"] -> ["2", "2","1"]
public class Problema1 {
    public static void main(String[] args) {
//        List<String> lista = new ArrayList<String>();
//        lista.add("apa");
//        lista.add("sare");
//        lista.add("suc");
//
//        for (String cuvant : lista) {
//            System.out.println(vocaleCount(cuvant));
//        }
//    }
//
//    public static int vocaleCount(String a) {
//        int counter = 0;
//        for (int i = 0; i < a.length(); i++) {
//            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
//                counter++;
//            }
//        }
//        return counter;
//    }



















































        //1. Am o lista de stringuri. Inlocuieste in lista valorile stringurilor cu nr de vocale din string (daca e pe pozitie para) si cu nr de consoane (daca e pe pozitie impara)
        List<String> listaCuvinte = new ArrayList<String>();
        listaCuvinte.add("apa");
        listaCuvinte.add("suc");
        listaCuvinte.add("sare");

        for (int i = 0; i < listaCuvinte.size(); i++) {
            System.out.println(returnNrOfVocals(listaCuvinte.get(i)));
        }

    }
    public static int eVocala (char vocale){
        if (vocale == 'a' || vocale=='e' || vocale == 'i' || vocale=='o' || vocale=='u'){
            return 1;
        }
        else return 0;
    }

    public static int returnNrOfVocals (String x) {
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if (eVocala(x.charAt(i)) == 1) {
                count++;
            }
        }
        return count;
    }

}
