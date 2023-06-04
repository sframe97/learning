package Liste;

import java.util.ArrayList;
import java.util.List;

//2. Am o lista de numere. Printeaza toate valorile: pare si prime.
public class Problema2 {
    public static void main(String[] args) {
        List<Integer> numere = new ArrayList<Integer>();
        numere.add(12);
        numere.add(8);
        numere.add(1);
        numere.add(7);

        int nrPrime = 0;
        int nrPare = 0;

        for (int i = 0; i < numere.size(); i++) {
            if (isPrime(numere.get(i))) {
                nrPrime++;
            }
            if (isEven(numere.get(i))) {
                nrPare++;
            }
        }

        System.out.println(nrPare);
        System.out.println(nrPrime);
    }

    public static boolean isEven(int a) {
        if (a % 2 == 0)
            return true;
        else {
            return false;
        }
    }

    public static boolean isPrime(int nr) {
        if (nr==1) {
            return false;
        }
            for (int i = 2; i <= nr / 2; i++) {
                if (nr % i == 0) {
                    return false;
                }
            }

        return true;
    }
}
