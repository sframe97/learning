package Arrays;
//7.Am un array cu stringuri. Scrie o metoda care face replace la fiecare cuvant cu inversul lui.
public class Problema7g {
    public static void main(String[] args) {
        String[] sir = {"ana", "are", "mere"};
        for (int i = 0; i < sir.length ; i++) {
            sir[i]=inverseaza(sir[i]);
        }
        for (int i = 0; i < sir.length ; i++) {
            System.out.println(sir[i]);
        }

    }
    public static String inverseaza (String a) {
        String gol = "";
        for (int i = a.length()-1; i >= 0 ; i--) {
            gol += a.charAt(i);
        }
        return gol;
    }
}
