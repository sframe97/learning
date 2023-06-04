package Arrays;
//4. Scrie o metoda care primeste un numar si pe baza numarului defineste un triunghi cu toate valorile pana la acea valoare.
public class Problema4d {
    public static void main(String[] args) {
        int a = 5;
     triunghi(a);
    }
    public static void triunghi (int a){
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(j + 1);
            }
            System.out.println("");
        }
    }
}
