package Metode;
//5.Creaza o metoda care returneaza true daca un anumit caracter e vocala si false daca nu e vocala.
public class Problema5 {
    public static boolean isVowel(char a) {
        switch (a) {
            case 'a':
            case 'e':
            case 'u':
            case 'i':
            case 'o':
                return true;
            default:
                return false;

        }
    }

    public static void main(String[] args) {
        System.out.println(isVowel('e'));
    }
}
