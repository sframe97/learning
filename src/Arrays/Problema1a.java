package Arrays;

//1. scrie un program care returneaza caracterul din mijloc al unui string. (daca nr de caractere e impar, returneaza pe cel din mijloc. daca nr de caractere e par, returneaza-le pe cele 2 din mijloc).
public class Problema1a {
    public static void main(String[] args) {
        String sirImpar = "apateri";
        String sirPar = "Portocalaa";

        System.out.println(returnImpar(sirImpar));

        System.out.println(returnPar(sirPar));
    }


    public static char returnImpar(String impar) {
        return impar.charAt(impar.length() / 2);
    }

    public static String returnPar(String par) {
        char firstCharacter = par.charAt(par.length() / 2 - 1);
        char secondCharacter = par.charAt(par.length() / 2);
        return "" + firstCharacter + secondCharacter;
    }

}
