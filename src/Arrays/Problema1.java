package Arrays;
//1. Calculati nr de elemente prime dintr-un sir

public class Problema1 {
    public static void main(String[] args) {
        int[] s = {2, 5, 7, 10, 4, 11};
        System.out.println(getPrimeNumbers(s));
//        int[] sir = {5, 2, 4, 3, 8, 11, 17, 13};
//        int counter = 0;
//        for (int i = 0; i < sir.length; i++) {
//           if(nrDivizor(sir[i]) == 2){
//               counter++;
//           }
//        }
//        System.out.println(counter);
//    }
//    public static int nrDivizor (int a) {
//        int numarDedivizor=0;
//        for (int j=1; j<= a; j++){
//            if (a % j == 0){
//                numarDedivizor++;
//            }
//        }
//        return numarDedivizor;
//    }


    }

    public static boolean isPrime(int nr) {
        if (nr > 1) {
            for (int i = 2; i <= nr / 2; i++) {
                if (nr % i == 0) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
    }

    public static int getPrimeNumbers(int[] sir) {
        int nr = 0;
        for (int i = 0; i < sir.length; i++) {
            if (isPrime(sir[i])) {
                nr++;
            }
        }
        return nr;
    }
}
