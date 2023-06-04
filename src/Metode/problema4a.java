package Metode;

public class problema4a {
    public static void main(String[] args) {
        //4.Defineste o metoda care calculeaza maximul dintre 3 numere date.
        System.out.println(max3Elemente(26, 38, 9));
    }
    public static int maxim (int a, int b){
        if (a>b){
            return a;
        }else {
            return b;
        }
    }

    public static int max3Elemente (int x, int y, int z) {
        // numele variabilelor unei functii nu trebuie sa corespunda cu numele variabilelor cand se apeleaza functia
        int maximDeNr = maxim(x, y);
        if (maximDeNr<z){
            return z;
        }else return maximDeNr;
    }
}
