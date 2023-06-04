package Metode;

//4.Defineste o metoda care calculeaza maximul dintre 3 numere date.
public class Problema4 {

    public static int nrMax(int a, int b, int c) {
        if (a > b) {
            if (a > c) {
                return a;
            } else {
                return c;
            }

        }
        else {
            if (b > c) {
                return b;
            } else {
                return c;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(nrMax(4, 12, 99));
    }
}
