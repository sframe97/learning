package Metode;

// 2. Rezolva problema folosind metode (cel putin 2) (Having a quote as string: "Test automation is wonderful". Compute how many vowels and consonant exists.)
public class Problema2 {
    public static boolean isVowel (char c){
        c = Character.toLowerCase(c);
        if (c=='a' || c =='e' || c=='i' || c == 'o' || c =='u'){
            return true;
        }else return false;
    }
    public static boolean isLetter(char c){
        c = Character.toLowerCase(c);
        if (c>'a' && c<='z'){
            return true;
        }else return false;
    }
    public static String computeVowelsAndConsonate(String text){
        int c = 0;
        int v = 0;
        for (int i = 0; i <text.length() ; i++) {
            if (isLetter(text.charAt(i))){
                if (isVowel(text.charAt(i))){
                    v++;
                }else {
                    c++;
                }
            }
        }
        return "vocale:"+v+" consoane:"+c;
    }
//    public static int countVowels(String stringToEvaluate) {
//        int counter = 0;
//        for (int i = 0; i < stringToEvaluate.length(); i++) {
//            if (isVowel(stringToEvaluate.charAt(i))) {
//                counter++;
//            }
//        }
//        return counter;
//    }
//
//    public static int countConsonant(String stringToEvaluate) {
//        int counter = 0;
//        for (int i = 0; i < stringToEvaluate.length(); i++) {
//
//            if (!isVowel(stringToEvaluate.charAt(i))) {
//                counter++;
//            }
//        }
//        return counter;
//    }
//
//    public static boolean isVowel(char a) {
//        switch (a) {
//            case 'a':
//            case 'e':
//            case 'u':
//            case 'i':
//            case 'o':
//                return true;
//            default:
//                return false;
//
//        }
//
//    }
//
    public static void main(String[] args) {
      //  String stringToEvaluate = "Test automation is wonderful";
  //      System.out.println("number of vowels " + countVowels(stringToEvaluate.toLowerCase()));
   //     System.out.println("number of consonant " + countConsonant(stringToEvaluate.toLowerCase()));
        System.out.println(computeVowelsAndConsonate("java rulzz!"));
    }

}
