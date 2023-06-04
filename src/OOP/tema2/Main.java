package OOP.tema2;

public class Main {
    public static void main(String[] args) {
        Copil copil = new Copil();
       // copil.setName("Andrei");
        copil.nume="Andrei";
        copil.maJoc();
        copil.varsta=15;
        System.out.println(copil.getVarsta());
        copil.canta(30);
        copil.doarme();

        Adult adult = new Adult();
        adult.setName("Vasile");
        adult.muncesc();
        adult.doarme();
    }
}
