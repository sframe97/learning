package Arrays;
//3. Scrie o metoda care face interschimbarea a doua valori dintr-un array. (metoda trebuie sa primeasca indexul elementelor care trebuies intershmbate)
public class Problema3c {
    public static void main(String[] args) {
        int[] sir = {2, 4, 6, 7};
        int indexA = 1;
        int indexB = 3;
        int temp = sir[indexA];
        sir[indexA] = sir[indexB];
        sir[indexB]=temp;
        for (int i = 0; i <sir.length ; i++) {
            System.out.println(sir[i]);
        }
    }

}
