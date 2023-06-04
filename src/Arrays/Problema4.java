package Arrays;
//4. calculati a la puterea i, unde a e un element din sir si i este indexul lui. e.g. [1,2,3] -> [1, 2, 9]

public class Problema4 {
    public static void main(String[] args) {
        int[] sir = {2, 4, 7, 6};
        for (int i = 0; i < sir.length ; i++) {
            System.out.println(putere(sir[i], i));
        }
    }
    public static int putere (int a, int b){
        int nrPutere = 1;
        for (int i = 0; i <b ; i++) {
            nrPutere=nrPutere*a;
        }
        return nrPutere;
    }
}


