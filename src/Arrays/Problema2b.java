package Arrays;
//2.Scrie un program java care gaseste toate numerele prime gemene mai mici dacat 40. (nr prim geaman este cu 2 mai mare decat fratele sau)
public class Problema2b {
    public static void main(String[] args) {
        int counter = 0;
        for (int i = 1; i <=40 ; i++) {
           // System.out.println(i);
            if(nrDivizor(i) == 2 && nrDivizor(i + 2) == 2){
                System.out.println(i + " " + (i + 2));
            }
        }
        System.out.println(counter);
    }

    public static int nrDivizor (int a) {
        int numarDedivizor=0;
        for (int j=1; j<= a; j++){
            if (a % j == 0){
                numarDedivizor++;
            }
        }
        return numarDedivizor;
    }
}

