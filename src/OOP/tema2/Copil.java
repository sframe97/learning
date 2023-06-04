package OOP.tema2;

public class Copil extends Person {
    public void maJoc() {
        System.out.println("eu " + nume + " ma joc");
    }

    @Override
    public int getVarsta() {
        return 150;
    }

    public void canta(int timp) {
        System.out.println("cant " + timp + " minute");
    }

}
