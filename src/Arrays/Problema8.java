package Arrays;
//8. gasiti perechile de numere dintr-un sir ale caror suma e egala cu un numar specificat

public class Problema8 {
    public static void main(String[] args) {
        int [] sir = {3, 4, 6, 9};
        int nrSpecificat = 15;
        for (int i = 0; i < sir.length ; i++) {
            for (int j = i+1; j <sir.length ; j++) {
                if (sir[i] + sir[j]==nrSpecificat){
                    System.out.println(sir[i]);
                    System.out.println(sir[j]);
                }
            }
        }
    }

}
