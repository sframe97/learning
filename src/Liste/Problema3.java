package Liste;

import java.util.ArrayList;
import java.util.List;

//3. Am 2 liste [4,5,7,2] si [5,2,9,3]. Calculeaza cate elemente comune au cele 2 liste.Creaza o lista care sa contina doar elementele care nu sunt comune in cele 2 liste.
public class Problema3 {
    public static void main(String[] args) {
        List<Integer> primaLista = new ArrayList<Integer>();
        primaLista.add(4);
        primaLista.add(5);
        primaLista.add(7);
        primaLista.add(2);

        List<Integer> adouaLista = new ArrayList<Integer>();
        adouaLista.add(5);
        adouaLista.add(2);
        adouaLista.add(9);
        adouaLista.add(3);

        List<Integer> aTreiaLista = new ArrayList<Integer>();


        int nrElemente = 0;
        for (int i = 0; i < primaLista.size(); i++) {
            if (searchingForAnElement(primaLista.get(i),adouaLista) == 1){
                nrElemente ++;
                aTreiaLista.add(primaLista.get(i));
            }
        }
        System.out.println(aTreiaLista);
    }

    public static int searchingForAnElement(int a, List<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            if (a == lista.get(i)) {
                return 1;
            }
        }
        return 0;
    }
}
