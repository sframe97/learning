package Liste;

import java.util.HashMap;

//5. Am un map care gestioneaza numarul de produse din lista de cumparaturi pentru: apa, ulei, suc, prajitura, paine.
//Defineste un map si expune:
//- produsul care are cea mai mare cantitate
//- key-ul care are cea mai mare lungime
//- calculeaza numarul total de produse din lista de cumparaturi
//- sterge un produs din map
//- modifica un produs din map
public class Problema5 {
    public static void main(String[] args) {
        HashMap<String, Integer> cumparaturi = new HashMap<String, Integer>();
        cumparaturi.put("apa", 5);
        cumparaturi.put("ulei", 2);
        cumparaturi.put("suc", 4);
        cumparaturi.put("baloane", 54);
        cumparaturi.put("prajitura", 8);
        cumparaturi.put("paine", 3);


        int suma = 0;
        System.out.println(cumparaturi.size());
        for (Integer cumparatura : cumparaturi.values()){
            suma = suma + cumparatura;
        }
        System.out.println(suma);

        int max = 0;
        for (Integer cumparatura : cumparaturi.values()){
           if (max < cumparatura ){
               max=cumparatura;
           }
        }
        System.out.println(max);
        cumparaturi.remove("ulei");
        System.out.println(cumparaturi.size());
        System.out.println(cumparaturi);
        cumparaturi.put("apa", 10);
        System.out.println(cumparaturi);

        int cheieMaxima = 0;
        String cuvantMaxim = " ";
        for (String maxValue : cumparaturi.keySet()){
            if (cheieMaxima < maxValue.length()){
                cheieMaxima=maxValue.length();
                cuvantMaxim=maxValue;
            }
        }
        System.out.println(cheieMaxima + " "+ cuvantMaxim);
    }
}
