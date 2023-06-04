package Arrays;
//7. gasiti elementele comune din 2 siruri. e.g. a={"java","happy","jordita"} b={"floare,"pom","jordita"} --> jordita

public class Problema7 {
    public static void main(String[] args) {
        String[] sir1 = {"ana", "are" ,"mere"};
        String[] sir2 = {"afara" ,"ninge" ,"cu", "mere", "are"};
        for (int i = 0; i < sir2.length; i++) {
            if (cautaCuvant(sir2[i], sir1) == 1){
                System.out.println(sir2[i]);
            }
        }
    }
    public static int cautaCuvant (String a, String[] sir) {
        for (int i = 0; i < sir.length ; i++) {
            if (a == sir[i]){
                return 1;
            }
        }
        return 0;
    }
}
