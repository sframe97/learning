package Metode;

import org.junit.Ignore;

public class problema2a {
    // 2. Rezolva problema folosind metode (cel putin 2) (Having a quote as string: "Test automation is wonderful". Compute how many vowels and consonant exists.)
    public static void main(String[] args) {
        String quote = "test automation is wonderful";
        //b declari 2 variabile in care se stocheaza numarul de consoane si nr de vocale
        int nrConsoane=0;
        int nrVocale=0;

        //c compari variabila cu string-ul
        for (int i = 0; i <quote.length() ; i++) {
            //d. obtinem caracterul curent(pt pozitia 0 obtinem t, pt pozitia 1 obtinem e)
            char currentChar=quote.charAt(i);
            if (isVowel(currentChar)){
                //e. stocam nr de vocale/consoane
                nrVocale=nrVocale+1;
            } else {
                // daca nu e vocala poate sa fie numai consoana
                nrConsoane=nrConsoane+1;
            }
        }
        System.out.println(nrConsoane);
        System.out.println(nrVocale);
    }

    // a. fac o functie pt a declara vocale/consoane
    // header/antet e structura unei functii (tipul functie si parametrii(tipul de data al lor) pe care ii are)
    public static boolean isVowel(char character) {
      if (character=='a' || character == 'e' || character == 'i' || character == 'o' || character == 'u') {
          return true;
      } else return false;
    }
}
