package Arrays;
//5.Scrie o metoda care primeste un numar si pe baza numarului defineste un triunghi cu toate valorile repetate intr-o linie.
public class Problema5e {
    public static void main(String[] args) {
        int a = 5;
        triunghi(a);
    }
    public static void triunghi (int a){
        for (int i = 0; i <a ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(i + 1);
            }
            System.out.println("");
        }
    }
}
