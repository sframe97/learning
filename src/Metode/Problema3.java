package Metode;

// 3. Rezolva problema folosind metode (cel putin 3) (I take into consideration the numbers from 1 to 5 For odd numbers, compute their sum, for even numbers, compute their product.)
public class Problema3 {
    public static boolean isEven(int a) {
        if (a % 2 == 0) {
            return true;
        }
        return false;
    }
    public static int sumOfNumbers (int a, int b){
        return a+b;
    }
    public static int prodOfNumbers (int a, int b){
        return a*b;
    }

    public static void main(String[] args) {
        int suma=0;
        int produs=1;
        for (int i = 1; i <=5 ; i++) {
            if (isEven(i)){
               suma= sumOfNumbers(suma, i);
            }else {
                produs=prodOfNumbers(produs, i);
            }
        }
        System.out.println("suma este " + suma);
        System.out.println("produsul este " + produs);
    }


}

