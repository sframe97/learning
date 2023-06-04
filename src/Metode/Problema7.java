package Metode;

//import com.sun.deploy.uitoolkit.impl.fx.AppletStageManager;

//7. Scrie o metoda java care calculeaza cate cuvinte sunt intr-un string.
public class Problema7 {
    public static int nrCuvinte (String stringToEvaluate){
        int counter = 1;
        for (int i = 0; i <stringToEvaluate.length() ; i++) {
            if (stringToEvaluate.charAt(i) == ' '){
                counter++;
            }
        }
        return counter;
    }

    public static void main(String[] args) {
        System.out.println(nrCuvinte("ana are mere"));
    }
}
