package Arrays;
//6. aveti un sir de cuvinte. returnati cuvantul format din prima litera a fiecarui cuvant

public class Problema6 {
    public static void main(String[] args) {
        String[] sirCuvinte = {"ana", "are", "mere"};
        for (int i = 0;  i<sirCuvinte.length ; i++) {
            System.out.print(sirCuvinte[i].charAt(0));
        }
    }
}
