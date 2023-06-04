package Arrays;
//2. calculati factorialul fiecarui element din sir.e.g. [1,2,3] -> [1,2,6]
public class Problema2 {
    public static void main(String[] args) {
        int[] s = {2, 5, 7, 4};
//        System.out.println(getArrayFactorial(s));
//        for (a:s){
//            System.out.println(getArrayFactorial(a));
//        }
//        int[] sir = {1, 2, 3, 4};
//
//        for (int i = 0; i < sir.length ; i++) {
//            System.out.println(factorial(sir[i]));
//        }
//    }
//    public static int factorial (int a){
//        int factorialDeNumar = 1;
//        for (int i = 1; i <=a ; i++) {
//            factorialDeNumar=factorialDeNumar*i;
//        }
//        return factorialDeNumar;
//    }
    }
    public static int factorial (int nr) {
        int f = 1;
        for (int i = 1; i <=nr ; i++) {
            f = f * i;
        }
        return f;
    }
    public static int [] getArrayFactorial (int[] sir){
        //int[] sir2 = new int[sir.length]
        for (int i = 0; i < sir.length ; i++) {
            sir[i] = factorial(sir[i]);
        }
        return sir;
    }
}
