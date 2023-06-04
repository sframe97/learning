package Arrays;
//3.am un array de nr intregi. daca elementul e pe o pozitie para, elementul va deveni cubul lui. daca elementul e pe o pozitie impara, elementul se va schimba in factorialul lui.

public class Problema3 {
    public static void main(String[] args) {
        int[] sir = {1, 2, 3, 4, 5, 6};
        for (int i = 1; i <= sir.length ; i++) {
            if (i % 2 == 0){
                sir[i-1]=calculezCub(sir[i-1]);
            }else {
                sir[i-1]=calculezFactorial(sir[i-1]);
            }
            System.out.println(sir[i-1]);
        }

    }
    public static int calculezCub (int a){
        int cub = a*a*a;
       return cub;
    }

    public static int calculezFactorial(int b){
        int factorialDeNumar = 1;
        for (int i = 1; i <=b ; i++) {
            factorialDeNumar=factorialDeNumar*i;
        }
        return factorialDeNumar;
    }
}
