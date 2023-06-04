package Arrays;
//6.Aveti un array cu stringuri. Calculeaza cate cuvinte intre 2(inclusiv) si 5(inclusiv) caractere sunt si cate au mai mult de 5 caractere. Daca un cuvant are lungimea 1, opreste-te.
public class Problema6f {
    public static void main(String[] args) {
        String[] sir = {"alexandru", "cel", "viteaz"};
        for (int i = 0; i <sir.length ; i++) {
            int count=numar(sir[i]);
            if (count == 1){
                System.out.println(sir[i] + " stringul e intre 2 si 5 ");
            }
            if (count == 2){
                System.out.println(sir[i] + " sirul e mai mare decat 5");
            }
            if (count == 0) {
                break;
            }
        }
    }
    public static int numar (String a){
        if (a.length() >= 2 && a.length() <= 5)
            return 1;
        if (a.length() > 5)
            return 2;
        return 0;
    }
}
