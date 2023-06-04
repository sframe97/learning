package Arrays;
//5. returnati cuvantul care are cele mai multe vocale dintr-un sir

public class Problema5 {
    public static void main(String[] args) {
        String[] sirCuvinte = { "nu", "e", "amuzanta", "programarea"};
        String cuvantMax = "";
        int maxim = 0;
        for (int i = 0; i <sirCuvinte.length ; i++) {
            if (maxim < vocaleCount(sirCuvinte[i])){
                maxim = vocaleCount(sirCuvinte[i]);
                cuvantMax = sirCuvinte[i];
            }
        }
        System.out.println(cuvantMax);

    }

    public static int vocaleCount(String a) {
        int counter = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == 'a' || a.charAt(i) == 'e' || a.charAt(i) == 'i' || a.charAt(i) == 'o' || a.charAt(i) == 'u') {
                counter++;
            }
        }
        return counter;
    }

}
